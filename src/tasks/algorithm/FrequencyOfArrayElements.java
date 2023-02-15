package tasks.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "apple", "Cherry", "Apple"};
        System.out.println(findFrequencyElements(arr));//{apple=1, Apple=2, Cherry=1, Banana=1}
        Arrays.stream(arr).distinct().forEach(e ->
                System.out.println(e+"="+Arrays.stream(arr).filter( p -> p.equals(e)).count() ));

    }

    public static Map<String, Integer> findFrequencyElements(String[] arr) {
        Map<String, Integer> map = new HashMap<>();//order is not important
        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) { //case sensitivity
                    frequency++;
                }
            }
            map.put(arr[i],frequency);
        }

        return map;
        // arr.length= n=> time complexity O(n^2) for better time complexity
        //second solution

    }
  //  public static  Map<String, Integer> findFrequencyElement(String[] arr) {
      //  Map<String,Integer> map= Arrays.stream(arr)
          //      .collect(Collectors.toMap(arr[]));

                //.filter(i->i.equals(i))
               // .count()



  //  }


}
/*
Question-2 Frequency of Array Elements
Write a function that takes a String array as parameter and returns a map object that
contains each element of array as key and their occurrence counts as value.
For calculating occurrence, array elements should be checked by regarding case sensitivity.
Order is not important.
EXAMPLE:
Input: {"Apple", "Banana", "apple", "Cherry", "Apple"}
Output: returning map elements: {Apple=2, apple=1, Cherry=1, Banana=1}
 */