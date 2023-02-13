package tasks.array_tasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumOfTwoNumbersTarget {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};//[0,1]
        int target = 9;
//array[i]+array[j]=target value
        //I can make nested loops and I can compare every item with another one//brute force solution
        System.out.println(findSumOfTwoNumbersTarget(nums,target));//[0, 1]
        System.out.println(findTwoSum(nums,target));//[0, 1]

    }

    public static String findSumOfTwoNumbersTarget(int[] nums, int target) {

        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    //   arr = new int[]{i,j};
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return Arrays.toString(arr);
//2. What is the time complexity of your solution?
        //nums.length=n    (c0+c1)*n*n remove constant-> time complexity=>  O(n^2)

    }
    //second solution
    public static String findTwoSum(int[] nums, int target){
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        //im gonna create map key will be each element value will be index;
        for (int i = 0; i < nums.length; i++) {//2 7 11 15
            if (map.containsKey(target - nums[i])){//map contains element(target-element) dont add
                arr[0] = map.get(target - nums[i]);//to get value means index
                arr[1] = i;

            }else{
                map.put(nums[i], i);//add element
            }

        }
        System.out.println(map);//{2=0, 11=2, 15=3}
        return Arrays.toString(arr);
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