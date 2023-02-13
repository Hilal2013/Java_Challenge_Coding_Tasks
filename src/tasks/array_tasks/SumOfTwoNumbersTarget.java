package tasks.array_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbersTarget {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};//[0,1]
        int target = 9;
        int[] result = findSumOfTwoNumbersTarget(nums, target);
        System.out.println(Arrays.toString(result));//[0, 1]
        int[] result2 = findTwoSum(nums, target);
        System.out.println(Arrays.toString(result2));//[0, 1]

    }

    public static int[] findSumOfTwoNumbersTarget(int[] nums, int target) {

        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // arr[0]=i;  arr[1]=j;
                    arr = new int[]{i, j};

                }
            }
        }
        return arr;
//What is the time complexity of your solution?
        //nums.length=n    (c0+c1)*n*n remove constant-> time complexity=>  O(n^2)
    }

    //second solution for better time complexity
    public static int[] findTwoSum(int[] nums, int target) {

        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        //im gonna create map key will be each element
        // value will be index //to get index through using get()method
        for (int i = 0; i < nums.length; i++) {//2 7 11 15
            if (map.containsKey(target - nums[i])) {//map contains the other element(target-element) //form your arr
                arr[0] = map.get(target - nums[i]);//to get value means index//first element index
                arr[1] = i;

            } else {
                map.put(nums[i], i);//add element and index
            }
        }
        System.out.println(map);//{2=0, 11=2, 15=3}
        return arr;
//2. What is the time complexity of your solution?
        //nums.length=n    (c0+c1+c2)*n remove constant-> time complexity=>  O(n)

    }


}
/*
input:numbers = {1 , 2, 100, 7, 11, 15, 999 };
 target = 9
 output: [1, 3]
find the sum of 2 integer values equal
to 9 and return there indexes
TARGET 9 TASK

 input:numbers = {1 , 2, 100, 7, 11, 15, 999 };
 target = 9
 output: [1, 3]

Find the sum of 2 integer values equal to target (9) and return their indexes.
 */