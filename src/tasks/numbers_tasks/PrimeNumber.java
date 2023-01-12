package tasks.numbers_tasks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        checkPrimeNumbers(num);

        input.close();
    }

    public static void checkPrimeNumbers(int num) {

        if (num == 0) {
            throw new RuntimeException("Zero is neither prime nor composite");
        }
        if (num == 1) {
            throw new RuntimeException("Modern mathematicians define a number as prime " +
                    "if it is divided by exactly two numbers(1 and the number itself)" + "\n" +
                    "1 can only be divided by one number, 1 itself, so with this definition 1 is not a prime number");

        }
        if (num < 0) {
            throw new RuntimeException("Negative integers can not be prime");
        }
        String result = "";

        if (num > 1) {
            if (num == 2 || num == 3 || num == 5 || num == 7) {
                result = num + " is prime number because " + num + " is only divisible by 1 and itself";
            } else if (num % 2 == 0 || num % 3 == 0 || num % 5 == 0 || num % 7 == 0) {
                result = num + " is not a prime number";
            }else if(num % num == 0 && num % 1 == 0){
                result = num + " is prime number because " + num + " is only divisible by 1 and itself";
            }
        }
        System.out.println(result);
    }
//Muhtar solution
public static boolean primeNumber(int num) {
    if (num < 2) {
        return false;
    }

    for (int i = 2; i < num; i++) {
        if (num % i == 0) {
            return false;
        }
    }

    return true;

}
}
 /*
        Write a method that can check if a number is prime or not
     */