package tasks.numbers_tasks;

import java.util.Scanner;

public class DivideWithoutDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter dividend");
        int dividend = input.nextInt();
        System.out.println("Enter divisor");
        int divisor = input.nextInt();
        divide(dividend, divisor);

        input.close();

    }

    public static void divide(int dividend, int divisor) {
        int frequency = 0;//Im gonna find how many times we did substraction and frequency will be our quotient

        if (divisor == 0) {
            throw new ArithmeticException("Invalid number");
        }

        int minus = 1;
        if (dividend * divisor < 0) {//-6/2 or 6/-2
            minus = -1;
        }
        dividend = Math.abs(dividend);//absolute value//|-6|=6
        divisor = Math.abs(divisor);

        while (dividend >= divisor) {//repeated if statement //when repetition is not fixed
            dividend = dividend - divisor; //dividend-=divisor
            frequency++;
        }
        // System.out.println("Quotient= "+frequency);
        System.out.println("Quotient= "+(frequency*minus)+" Remainder= "+dividend);
    }
//Muhtar solution
public static void divide1(int num1, int num2) {
    if (num2 == 0) {
        System.out.println("Invalid Number");
        return;
    }

    int count = 0;
    while (num1 >= num2) {
        num1 -= num2;
        count++;
    }
    System.out.println(count + " and remainder is " + num1);
}
}
 /*
    Write a method that can divide two numbers without using division operator
     */
/*
we can calculate division by using repeated subtraction
if we divide 10 by 2 it will give the result//quotient 5
10-2=8 8-2=6 6-2=4 4-2=2 2-2=0
how many times we did substraction 5 times result/quotient=5

 */