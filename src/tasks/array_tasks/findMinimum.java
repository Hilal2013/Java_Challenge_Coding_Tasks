package tasks.array_tasks;

public class findMinimum {
    public static void main(String[] args) {
        int[] arr={15,-2,23,78,0,-2};
        System.out.println(findMin(arr));//-2

    }
    public static int findMin(int[] arr){

        int min=arr[0];
        for (int each : arr) {
            if(each<min){
                min=each;

            }

        }
        return min;
    }


}
 /*
    Write a function that can find the maximum number from an int Array
     */
