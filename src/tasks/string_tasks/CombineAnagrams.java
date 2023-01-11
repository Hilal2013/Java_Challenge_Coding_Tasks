package tasks.string_tasks;

import java.util.*;

public class CombineAnagrams {
    public static void main(String[] args) {
        //   List<String> list=new ArrayList<>(Arrays.asList("eat", "tea", "tam", "ate", "mat", "bat"));
        String[] arr = {"eat", "tea", "tam", "ate", "mat", "bat"};
        for (int i = 0; i < arr.length; i++) {
           Arrays.sort(arr[i].toCharArray());
            for (int j = i + 1; j < arr.length; j++) {
               // if (Arrays.equals(Arrays.sort(arr[i].toCharArray()),Arrays.sort(arr[j].toCharArray()))) {


             //   }
            }
        }
    }
}
/*
input  str={"eat", "tea", "tam", "ate", "mat", "bat"}

output {{"bat"},{"mat","tam"},{"ate","eat","tea"}}

task is to combine words that are anagrams between themselves into a separate array
 */