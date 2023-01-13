package tasks.string_tasks;

public class SumOfAllIntegers {
    public static void main(String[] args) {

        System.out.println(sumOfIntegers("12 some text 3 7"));//22

    }
    public static int sumOfIntegers(String str){
        int sum = 0;
        String[] arr = str.split(" ");


        for (String each : arr) {

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