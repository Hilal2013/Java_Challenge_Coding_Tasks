package tasks.string_tasks;

import java.util.*;

public class CombineAnagrams {
    public static void main(String[] args) {
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
    }
}
/*
input  str={"eat", "tea", "tam", "ate", "mat", "bat"}

output {{"bat"},{"mat","tam"},{"ate","eat","tea"}}

task is to combine words that are anagrams between themselves into a separate array

  String s ="";
            for (String each : list) {
                s += each +" ";
            }
            // System.out.println(s);
            if (!list2.contains(s)){
                list2.add(s);
            }
            list.clear();
        }

        ArrayList<ArrayList<String>> last = new ArrayList<>();

        for (int i = 0; i < list2.size(); i++) {

            String[] a = list2.get(i).split(" ");
            ArrayList<String> al = new ArrayList<>(Arrays.asList(a));
            last.add(al);

        }

        System.out.println(last);


 */
