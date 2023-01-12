package tasks.string_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class FrequencyCharacterInSortedManner {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacterInSortedManner("DDDAACCCCCCB"));//A2B1C6D3

    }

    public static String frequencyOfCharacterInSortedManner(String str){
        TreeMap<String,Integer> map=new TreeMap<>();
        String[] arr=str.split("");
        for (String each : arr) {
            int frequency= Collections.frequency(Arrays.asList(arr),each);
            map.put(each,frequency);
        }
        System.out.println(map);//{A=2, B=1, C=6, D=3}
        String result="";
        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            result+=eachPair.getKey()+eachPair.getValue();
        }
      return result;
    }


}
/*
    Return the frequency of each character in the given string in Sorted manner
        Ex:
            Input: DDDAACCCCCCB
            Output: A2B1C6D3
     */