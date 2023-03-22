package tasks.algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfArrayElements {
    public static void main(String[] args) {
        String[] arr = {"Apple", "Banana", "apple", "Cherry", "Apple"};
        System.out.println(findFrequencyElements(arr));//{apple=1, Apple=2, Cherry=1, Banana=1}
        System.out.println(frequencyArray(arr));
        System.out.println(findFrequencyElementWithStream(arr));
        System.out.println(findFrequencyElementWithStream2(arr));

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
            map.put(arr[i], frequency);
        }

        return map;
        // arr.length= n=> time complexity O(n^2) for better time complexity
        //second solution
    }
        public static Map<String, Integer> frequencyArray(String[] arr){

            Map<String, Integer> map = new HashMap<>();

            for (String each : arr) {  // O(n)-->time complexity
                if(map.containsKey(each)){
                    map.put(each,map.get(each)+1);
                }else{
                    map.put(each,2);
                }
            }
            return map;

    }
    //solution with stream
  public static  Map<String, Long> findFrequencyElementWithStream(String[] arr) {
  return   Arrays.stream(arr)
          .filter(Objects::nonNull)
          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
}
//solution with stream 2
    public static  Map<String, Integer> findFrequencyElementWithStream2(String[] arr){
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(arr)
                .filter(Objects::nonNull)
                .distinct()
                .forEach(e ->map.put(e,(int)Arrays.stream(arr).filter(p->p!=null&&p.equals(e)).count()));

        return map;

    }


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