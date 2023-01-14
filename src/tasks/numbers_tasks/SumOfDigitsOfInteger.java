package tasks.numbers_tasks;

public class SumOfDigitsOfInteger {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while(number>0){//123//number=12 number =1//false
            sum += (number % 10);//remainder=3 sum=3 //remainder=2 sum=5//remainder=1 sum=6
            number /= 10;//123/10=12//12/10=1//number=1/10
        }


return sum;
    }
}
 /*
    write a function that can return the sum of digits of an integer Do not use any string manipulations
        Ex:
            input: 123
            output: 6
     */
