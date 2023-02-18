package tasks.algorithm;

import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FindFactorial {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        System.out.println(findFactorial(number));
        System.out.println(findFactorialWithStream(number));
        System.out.println(findFactorialWithStream2(number));
        scan.close();
    }
    //regular solution
    public static int findFactorial(int number){
        int result=1;
        for (int i = number; i>=1; i--) {//int i = 1; i<=number; i++
          result*=i;//result=result*i
        }
        return result;
        //Algorithm =>number= n=> time complexity O(n)
    }
//stream solution1
public static int findFactorialWithStream(int number){
        return IntStream.range(1,number+1)
                .reduce(1,(x,y)->x*y);

}
    //stream solution2
    public static int findFactorialWithStream2(int number){
        return Stream.iterate(1, i->i<number, i->i+1)//number, i->i>=1, i->i-1
                .reduce(1,(x,y)->x*y);
    }

    }
/*
Question-1 Find Factorial
Write a method that returns the factorial number of any given number.
Factorial: Factorial of a non-negative integer, is multiplication of all positive integers smaller
than or equal to n. For example, factorial of 6 is 6*5*4*3*2*1 which is 720.

 */