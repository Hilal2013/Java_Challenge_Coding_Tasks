package tasks.array_tasks;

import java.util.Arrays;

public class SumUpTo0 {
    public static void main(String[] args) {
       int N=7; //for example=> it will print  4 unique numbers// N should be (1 < N < 100)
        //we will use  symmetric pairs(-x,+x) to get sum=0 forexample (2,-2,5,-5)
        //if N is odd we will add"0"
findArraySumUpTo0(N);

int[] result=sumZero(N);
        System.out.println(Arrays.toString(result));
    }
    public static void findArraySumUpTo0(int N) {
        for (int i = 1; i <= N/2 ; i++){
            // if N is even
            System.out.print(i + ", " + -i + ", ");
        }

        // add extra 0 if N is odd
        if (N % 2 == 1)
            System.out.print(0);
    }
//solution two
public static int[] sumZero(int N) {

    int[] arr = new int[N];//array size will be N
    int k=0;//starts array size with k
    if(N==1){
        arr[0]=0;
        return arr;
    }
    if(N%2==0){//if N is even
        for(int i=1;i<=N/2;i++){
            arr[k]=i;
            k++;
            arr[k]=i*(-1);
            k++;
        }
    }
    else{//N is odd
        arr[0]=0;
        k=1;//first element 0 k willl start 1
        for(int i=1;i<(N+1)/2;i++){
            arr[k]=i;
            k++;
            arr[k]=i*(-1);
            k++;
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