package tasks.collection_tasks;

import java.util.*;

public class CombineAnagrams {
    public static void main(String[] args) {

        //// create a map w each key will be a word and value is arrayList so I will compare
        Map<String, ArrayList<String>> map = new HashMap<>();
//first iterate str array and put map //key will be each //value will be full array
        String[] str = {"eat", "tea", "tam", "ate", "mat", "bat"};
        for (String each : str) {
            map.put(each,new ArrayList<>(Arrays.asList(str)));
        }
           System.out.println(map);
//I created checkSame()method //first iterate map how entrySet()method
        for (Map.Entry<String, ArrayList<String>> eachPair : map.entrySet()) {
            String eachKey=eachPair.getKey();
            eachPair.getValue().removeIf(p->!checkSame(eachKey,p));
        }
        System.out.println(map);
//I just want values not keys anymore
        //then create nested(inner)list
        ArrayList<ArrayList<String>> nested = new ArrayList<>();
        for (Map.Entry<String, ArrayList<String>> eachPair : map.entrySet()) {
            if(nested.contains(eachPair.getValue())){
                continue;
            }
            nested.add(eachPair.getValue());
        }

        System.out.println(nested);//[[eat, tea, ate], [tam, mat], [bat]]

    }

    public static boolean checkSame(String firstWord, String secondWord) {
//check if 2 words are anagrams
        char[] ch1 = firstWord.toLowerCase().toCharArray();
        char[] ch2 = secondWord.toLowerCase().toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            return true;
        }
        return false;
    }
}
/*
input  str={"eat", "tea", "tam", "ate", "mat", "bat"}

output {{"bat"},{"mat","tam"},{"ate","eat","tea"}}

task is to combine words that are anagrams between themselves into a separate array

    //   List<String> list=new ArrayList<>(Arrays.asList("eat", "tea", "tam", "ate", "mat", "bat"));
        String[] arr = {"eat", "tea", "tam", "ate", "mat", "bat","set"};
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<ArrayList<String>> nested = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            char[] each = arr[i].toCharArray();
            Arrays.sort(each);
            for (int j = 0; j < arr.length; j++) {
                char[] element = arr[j].toCharArray();
                Arrays.sort(element);
                if (Arrays.equals(each, element) && !list1.contains(arr[j])) {
                    list1.add(arr[j]);//[eat, tea, ate, tam, mat, bat]

                }
            }

        }
        System.out.println(list1);
        System.out.println(list2);
        nested.addAll(Arrays.asList(list1,list2));
        System.out.println(nested);

 */
