package tasks.array_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class MergeTwoArrays {
    public static void main(String[] args) {

        BiFunction<int[],String[], List<Object>> merge=(arr1,arr2)->{
List<Object> list=new ArrayList<>();
            for (int each : arr1) {
list.add(each);
            }
            for (String each : arr2) {
                list.add(each);
            }
            return list;
        };
int[] nums={10,25,35,45};
String[] names={"Dilvin","Mahmut","Ayse","Hannan"};
        System.out.println(merge.apply(nums,names));
//[10, 25, 35, 45, Dilvin, Mahmut, Ayse, Hannan]

    }
    //Muhtar solution
    public static int[] concatTwoArrays(int[] arr1, int[] arr2) {

        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        for (int each : arr1) {
            result[i++] = each;
        }

        for (int each : arr2) {
            result[i++] = each;
        }

        return result;

    }

}
/*
    Write a return method that can concat two arrays
     */
