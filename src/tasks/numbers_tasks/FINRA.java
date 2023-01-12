package tasks.numbers_tasks;

import java.util.Scanner;

public class FINRA {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number");
        int number= input.nextInt();
        FINRA(number);
        input.close();
    }

    public static void FINRA(int number){

        for (int i = 1; i <=number ; i++) {
            String result="";
            if (i % 15==0) {//3 and 5
                result+="FINRA"+" ";
            } else if (i % 3 == 0) {
                result+="FIN"+" ";
            } else if (i % 5 == 0) {
                result="RA"+" ";
            } else {
                result+=""+i+" ";
            }
            System.out.print(result);
        }

    }

}
 /*
    Write a function which prints out the numbers from 1 to 30 but
    for numbers which are a multiple of 3, print "FIN" instead of the number
    and for numbers which are a multiple of 5, print "RA" instead of the number.
    for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
     */
