package tasks.array_tasks;

import java.util.Arrays;

public class SumUpTo0 {
    public static void main(String[] args) {
       int N=4; //for example 5 unique integers
int[] result=findArraySumUpTo0(N);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findArraySumUpTo0(int N) {
        int[] arr=new int[N];//new arrays's length will be=N
        int sum=0;



        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum==0){
                return arr;
            }
        }

        return arr;
    }



}
 /*
    Write a function:
        that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
        The function can return any such array.
        For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
        The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
        For N = 3 one of the possible answers is [-1,0,1] (but there are many more correct answers).
     */