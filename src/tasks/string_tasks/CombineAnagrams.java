package tasks.string_tasks;

import java.util.*;

public class CombineAnagrams {
    public static void main(String[] args) {
        //   List<String> list=new ArrayList<>(Arrays.asList("eat", "tea", "tam", "ate", "mat", "bat"));
        String[] arr = {"eat", "tea", "tam", "ate", "mat", "bat"};
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String>> innerList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
        char[] each=   arr[i].toCharArray();
            Arrays.sort(each);
            for (int j = i + 1; j < arr.length; j++) {
                char[] element  =arr[j].toCharArray();
                Arrays.sort(element);
                if (Arrays.equals(each, element) ){
             //       list.add(arr[i]);
               //     list.add(i,arr[j]);
              //    innerList.add(i,list);
                }else{
                    list.add(arr[i]);
                    innerList.add(i,list);
                }
            }
        }
        System.out.println(innerList);
    }
}
/*
input  str={"eat", "tea", "tam", "ate", "mat", "bat"}

output {{"bat"},{"mat","tam"},{"ate","eat","tea"}}

task is to combine words that are anagrams between themselves into a separate array
 */