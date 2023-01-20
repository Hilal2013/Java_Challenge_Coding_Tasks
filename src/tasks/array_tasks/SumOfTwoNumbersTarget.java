package tasks.array_tasks;

import java.util.Arrays;

public class SumOfTwoNumbersTarget {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 100, 7, 11, 8, 999 };
int target=9;
        findSumOfTwoNumbersTarget(arr,target);//[0, 5, 1, 3]

    }

   public static void findSumOfTwoNumbersTarget(int[] arr,int target) {
       String result = "";
       for (int i = 0; i < arr.length; i++) {
           for (int j = i+1; j < arr.length; j++) {
               if (arr[i] + arr[j] == target) {
                   result += i + "" + j;
               }
           }
       }
       String[] str = result.split("");
       System.out.println(Arrays.toString(str));//[0, 5, 1, 3]

       int size = str.length;//convert string array to int array
       int[] arr1 = new int[size];
       for (int i = 0; i < size; i++) {
           arr1[i] = Integer.parseInt(str[i]);
       }
       System.out.println(Arrays.toString(arr1));


   }
}
/*
input:numbers = {1 , 2, 100, 7, 11, 15, 999 };
 target = 9
 output: [1, 3]
find the sum of 2 integer values equal
to 9 and return there indexes
TARGET 9 TASK

 input:numbers = {1 , 2, 100, 7, 11, 15, 999 };
 target = 9
 output: [1, 3]

Find the sum of 2 integer values equal to target (9) and return their indexes.
 */