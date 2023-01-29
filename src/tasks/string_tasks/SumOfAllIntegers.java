package tasks.string_tasks;

import java.util.Arrays;

public class SumOfAllIntegers {
    public static void main(String[] args) {

        System.out.println(sumOfIntegers("12 some text 3 7"));//22

    }

    public static int sumOfIntegers(String str) {
        String[] arr = str.split(" ");//  from string to array
        String result = "";
        //first im gonna create checkDigitmethod(at the bottom) to check each one's first letter is digit or not
        for (int i = 0; i < arr.length; i++) {
            if (checkDigit(arr[i])) {
                result += arr[i] + ",";//if it is digit add result with comma
            }

        }
        System.out.println(result);//12,3,7,
        result = result.substring(0, result.lastIndexOf(','));//remove last comma//
        System.out.println(result);//12,3,7
        int sum = 0;
        String[] arr1 = result.split(",");
        System.out.println(Arrays.toString(arr));//[12, 3, 7]

        for (String each : arr1) {
            sum += Integer.parseInt(each);
        }

        return sum;
    }

    public static boolean checkDigit(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(0))) {
                return true;
            }
        }
        return false;
    }

}
   /*
            Please implement this method to
            return the sum of all integers found in the parameter String.
            You can assume that integers are separated from other parts with one or more spaces (' ' symbol).
            For example, s="12 some text 3 7", result: 22 (12+3+7=22)

      for (int i = 0; i < str.length()-1; i++) {
            char ch=str.charAt(i);char ch1=str.charAt(i+1);
            if(Character.isDigit(ch)&&Character.isDigit(ch1)){
                result+=ch+""+ch1+",";
            }else if(Character.isWhitespace(ch)&&Character.isDigit(ch1)){
                result+=ch1+",";
            }else{
                continue;
            }

        }



        */