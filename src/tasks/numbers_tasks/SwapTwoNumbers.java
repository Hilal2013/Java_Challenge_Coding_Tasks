package tasks.numbers_tasks;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {

        swapInteger(10, 20);//x=20 y=10
swapString("Mary","John");//FirstString=John SecondString=Mary
swapChar('A','B');//x=B y=A
    }
    public static void swapInteger(int x, int y) {
        x += y;//x=x+y//x=10+20=30
        y = x - y;//y=30-20=10
        x -= y; //x=x-y//x=30-10=20
        System.out.println("x=" + x + " y=" + y);

    }

    public static void swapString(String firstString, String secondString) {
        int firstLength=firstString.length();
    //    int secondlength=secondString.length();
        firstString=firstString+""+secondString;//MaryJohn
        secondString=firstString.substring(0,firstLength);//Mary
        firstString=firstString.substring(firstLength);

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

