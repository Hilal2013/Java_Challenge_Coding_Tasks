package tasks.numbers_tasks;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        swapInteger(10, 20);
swapString("Mary","John");
swapChar('A','B');
    }
    public static void swapInteger(int x, int y) {
        x += y;//x=x+y//x=10+20=30
        y = x - y;//y=30-20=10
        x -= y; //x=x-y//x=30-10=20
        System.out.println("x=" + x + " y=" + y);

    }

    public static void swapString(String firstString, String secondString) {

        System.out.println("FirstString=" + firstString + " SecondString=" + secondString);

    }
    public static void swapChar(char x, char y) {
//A=65 B=66
        x= (char) (x+y);
        y=(char)(x-y);
        x=(char)(x-y);

        System.out.println("x=" + x + " y=" + y);

    }

}

/*
  String a = "sasha";
        String b = "eshwa";

        int aL = a.length();//5

        System.out.println(a + "  " + b);

        a = a + b; // a = "sashaeashwa"
        b = a.substring(0,aL);// b = "sasha"
        //  "sashaeshwa"
        a = a.substring(aL);// a = "eashwa"
        //   "sashaeshwa"

        System.out.println(a + "  " + b);


 */