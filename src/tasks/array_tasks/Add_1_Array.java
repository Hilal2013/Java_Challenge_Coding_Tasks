package tasks.array_tasks;

import java.util.Arrays;

public class Add_1_Array {
    public static void main(String[] args) {
        int[] arr={9,9,9};
        returnArray(arr);//[1, 0, 0, 0]

    }
    public static void  returnArray(int[] arr){

        String str="";
        for (int i = 0; i < arr.length; i++) {//convert array to string
            str+=arr[i];

        }
        int num= Integer.parseInt(str)+1;//convert string to int and add 1
        String[] arr1=(String.valueOf(num)).split("");//now again array
        System.out.println(Arrays.toString(arr1));
    }

}
