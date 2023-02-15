package tasks.algorithm;

import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println(findFactorial(number));
        scan.close();
    }
    public static int findFactorial(int number){
        int result=1;
        for (int i = number; i>=1; i--) {
          result*=i;
        }
        return result;
        //Algorithm number= n=> time complexity O(n)
    }

}
/*
Question-1 Find Factorial
Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller
than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.

 */