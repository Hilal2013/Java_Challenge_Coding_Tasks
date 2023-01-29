package tasks.array_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class frequencyOfEachElement {
    public static void main(String[] args) {
       String[] arr1 = {"Apple","Banana","Apple","Cherry"};
       Integer[] arr2={12,34,12,-1,-1,12};
        findFrequencyOfEachElement(arr2);

    }
   public static <T> void findFrequencyOfEachElement(T[] arr){
       Map<T, Integer> map = new LinkedHashMap<>();
       for (int i = 0; i < arr.length; i++) {
           int frequency = 0;
           for (int j = 0; j < arr.length; j++) {
               if (arr[i] == arr[j]) {
                   frequency++;
               }
           }
           map.put(arr[i],frequency);
       }
       System.out.println(map);//{Apple=2, Banana=1, Cherry=1}

       for (Map.Entry<T, Integer> each : map.entrySet()) {
           System.out.println(each);
       }

   }
   /*
   System.out.println("--------------------------------------");
    //Solution 2:
    List<String> temp = Arrays.asList(testArray);
        for (String s : new LinkedHashSet<>(temp)) {
        System.out.println(s +"="+ Collections.frequency(temp, s) );
    }



        System.out.println("--------------------------------------");
    //Solution 3:
        Arrays.stream(testArray).distinct().forEach( e ->
            System.out.println(e+"="+Arrays.stream(testArray).filter( p -> p.equals(e)).count() ));

    */

}
/*
    Given the array return the output
                testArray = {"Apple","Banana","Apple","Cherry"}
                Output Example
                Apple = 2
                Banana = 1
                Cherry = 1
     */

