package tasks.array_tasks;

import java.util.Arrays;

public class Add_1_Array {
    public static void main(String[] args) {


            // int[] digits = {1, 2, 3};
            // int[] digits = {9, 9, 9};
            int[] digits = {1, 9, 9};

            System.out.println(Arrays.toString(plusOne(digits)));
            System.out.println(Arrays.toString(plusOneWithArray(digits)));
            System.out.println(Arrays.toString(plusOneWithTwoPointer(digits)));
        }

        public static int[] plusOneWithTwoPointer(int[] digits) {
            int left = 0;
            int right = digits.length - 1;
            while (left <= right) {// just im gonna decrease right in while loop
                if (digits[right] <= 8) {
                    digits[right] = digits[right] + 1;
                    return digits;
                }else if(digits[right] == 9){
                    digits[right]=0;
                    right--;
                }

            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }

        public static int[] plusOneWithArray(int[] digits) {
            for (int i = digits.length - 1; i >= 0; i--) {
                if (digits[i] <= 8) {
                    digits[i] = digits[i] + 1;
                    return digits;
                } else if (digits[i] == 9) {
                    digits[i] = 0;
                }
            }
            digits = new int[digits.length + 1];
            digits[0] = 1;
            return digits;
        }

        public static int[] plusOne(int[] digits) {
            String str = "";
            for (int i = 0; i < digits.length; i++) {//convert array to string
                str += digits[i];

            }
            int num = Integer.parseInt(str) + 1;//convert string to int and add 1
            int[] arr = Integer.toString(num)  //convert to String value
                    .chars() //get a stream
                    .map(c -> c - '0')// get the actual int value of a chracter
                    .toArray();//to terminate canvert the stream int array

            return arr;


        }

}
