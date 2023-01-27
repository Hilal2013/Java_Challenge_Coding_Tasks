package tasks.array_tasks;

public class findMaximum {
    public static void main(String[] args) {
        int[] arr={15,-2,23,78,0,-2};
        System.out.println(findMax(arr));

    }


    public static int findMax(int[] arr){

int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
              max=arr[i];
            }
        }

        return max;

    }


}
 /*
        Write a function that can find the maximum number from an int Array
     */