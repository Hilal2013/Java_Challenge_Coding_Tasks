package tasks.numbers_tasks;

public class SumOfDigitsOfInteger {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
    public static int sumOfDigits(int number) {
        int sum = 0;
        while(number>0){
            sum += (number % 10);
            number /= 10;
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
