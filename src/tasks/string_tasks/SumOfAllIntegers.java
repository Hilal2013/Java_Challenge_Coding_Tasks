package tasks.string_tasks;

import java.util.Arrays;

public class SumOfAllIntegers {
    public static void main(String[] args) {

        System.out.println(sumOfIntegers("12 some text 3 7"));//22

    }
    public static int sumOfIntegers(String str){

String result="";
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
        System.out.println(result);//12,3,7,
       result= result.substring(0,result.lastIndexOf(','));//remove last comma//
        System.out.println(result);//12,3,7
        int sum = 0;
        String[] arr = result.split(",");
        System.out.println(Arrays.toString(arr));//[12, 3, 7]

        for (String each : arr) {
            sum+=Integer.parseInt(each);
        }

        return sum;
    }

}
   /*
            Please implement this method to
            return the sum of all integers found in the parameter String.
            You can assume that integers are separated from other parts with one or more spaces (' ' symbol).
            For example, s="12 some text 3 7", result: 22 (12+3+7=22)
        */