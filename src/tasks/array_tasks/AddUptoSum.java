package tasks.array_tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AddUptoSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int sum = 10;
        Map<Integer, Integer> list=new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            list.put(arr[i],sum-arr[i]);
        }
        System.out.println(list);//{8=2, 7=3, 2=8, 5=5, 3=7, 1=9}

        Map<Integer, Integer> pairs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == sum){//8+7!=10 8+2=10
                    pairs.put(arr[i], arr[j]);
                }
            }
        }
        System.out.println(pairs);// {8=2, 7=3}
    }
}
/*
     given an int[] 'arr' and another int 'sum',
     Write a function which can find a pair of ints in 'arr' that add up to 'sum'.
        Example:
            arr = [8, 7, 2, 5, 3, 1]
            sum = 10
            Output:
                {8=2, 7=3}

         for (int j = 0; j < arr.length; j++) {

            }

     */