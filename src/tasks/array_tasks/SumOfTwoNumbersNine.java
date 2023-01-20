package tasks.array_tasks;

import java.util.Arrays;

public class SumOfTwoNumbersNine {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 100, 7, 11, 15, 999 };

        findSumOfTwoNumbersNine(arr);//[1, 3]

    }

   public static void findSumOfTwoNumbersNine(int[] arr) {
       String result = "";
       for (int i = 0; i < arr.length; i++) {
           for (int j = i; j < arr.length; j++) {
               if (arr[i] + arr[j] == 9) {
                   result += i + "" + j;
               }
           }
       }
       String[] str = result.split("");
       System.out.println(Arrays.toString(str));//[1, 3]
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
 */