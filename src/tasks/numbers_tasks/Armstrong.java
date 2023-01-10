package tasks.numbers_tasks;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        checkArmstrong(number);
        scan.close();

        System.out.println(isArmStrongNumber(153));
    }

    public static void checkArmstrong(int number) {
        //to convert number to String
        //  String stringNumber = "" + number;
        String  stringNumber=String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < stringNumber.length(); i++) {
            String charNumber=""+stringNumber.charAt(i);//convert char to string
            sum += Math.pow(Integer.parseInt(charNumber), stringNumber.length());
            //convert string to Integer

        }
        if (sum == number) {
            System.out.println(number + " is an armstrong number");
        } else {
            System.out.println(number + " is not an armstrong number! Try again!");
        }
    }
    public static boolean isArmStrongNumber(int num) {
        int a = 0, b = 0, c = num;

        while (num > 0) {
            a = num % 10;//153%10=3 => first digit //15%10=5//1%10=1
            num /= 10;//153/10=15 //15/10=1
            b = b + (a * a * a);//3^3=b=27//5^3==125//1
        }

        return (c == b) ? true : false;
    }


}
 /*
    Write a method that can check if a number is Armstrong number
     */