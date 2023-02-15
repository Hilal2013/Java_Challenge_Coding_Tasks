package tasks.algorithm;

import java.util.Arrays;

public class ArrayOfDigits {
    public static void main(String[] args) {
        int number=490;
      int[] result=  convertIntToArray(number);
        System.out.println(Arrays.toString(result));//[4, 9, 0]
    }
    public static int[] convertIntToArray(int number){

        String num=String.valueOf(number);
       char[] arr=num.toCharArray();
         int[] array=new int[num.length()];
        for (int i = 0; i < arr.length; i++) {
            array[i]=Character.getNumericValue(arr[i]);
        }
        return array;
    }
// arr.length= n=> time complexity O(n)
}
