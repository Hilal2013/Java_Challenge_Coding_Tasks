package tasks.numbers_tasks;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        swap(10, 20);////num1=20 num2=10
        swapInteger(10, 20);//num1=20 num2=10
        swapString("Mary", "John");//FirstString=John SecondString=Mary
        swapChar('A', 'B');//x=B y=A
    }

    public static void swap(int num1, int num2) {//by declaring temporary value
        int temp;
        //first im gonna assign temp to num1
        temp = num1; // if x is 10 temp will be 10
        //second im gonna assign num2 to num1
        num1 = num2;// num1 will be 20
        //lastly im gonna assign temp to num2
        num2 = temp;
        System.out.println("num1=" + num1 + " num2=" + num2);


    }

    public static void swapInteger(int num1, int num2) {//by arithmetic  operator

        //im gonna sum num1 and num2 and assign result to num1
        num1 += num2;//num1=30
        //substract num1 from num2 assign the result to num2
        num2 = num1 - num2;//num2=30-20=10
        //substract  num1 from  num2 assign the result to num1
        num1 -= num2; //num1=30-10=20
        System.out.println("num1=" + num1 + " num2=" + num2);

    }

    public static void swapString(String firstString, String secondString) {
        int firstLength = firstString.length();
        //    int secondlength=secondString.length();
        firstString = firstString + "" + secondString;//MaryJohn
        secondString = firstString.substring(0, firstLength);//Mary
        firstString = firstString.substring(firstLength);

        System.out.println("FirstString=" + firstString + " SecondString=" + secondString);

    }

    public static void swapChar(char x, char y) {
//A=65 B=66
        x = (char) (x + y);
        y = (char) (x - y);
        x = (char) (x - y);

        System.out.println("x=" + x + " y=" + y);

    }

}

