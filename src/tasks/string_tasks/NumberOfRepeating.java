package tasks.string_tasks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberOfRepeating {
    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(5,3,4,1,3,7,2,9,9,4);
        Map<Integer,Integer> mapNum=new LinkedHashMap<>();
        for (Integer each : numList) {
            int frequency= Collections.frequency(numList,each);
            mapNum.put(each,frequency);
        }
        System.out.println(mapNum);//{5=1, 3=2, 4=2, 1=1, 7=1, 2=1, 9=2}
String result="";
        for (Map.Entry<Integer, Integer> eachPair : mapNum.entrySet()) {
          result+=  eachPair.getKey()+" - "+eachPair.getValue()+", ";
        }
        System.out.println(result.substring(0,result.lastIndexOf(',')));
        //5 - 1, 3 - 2, 4 - 2, 1 - 1, 7 - 1, 2 - 1, 9 - 2

//Muhtar  solution
        List<String> stringList=Arrays.asList("Amanda","John","Alex","Amanda","John");

        Map<String,Long> mapString= stringList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mapString);//{Alex=1, John=2, Amanda=2}
//forEach Method =>BiConsumer//terminal operation
       mapString.forEach((key,value)->{
           System.out.println(key+" - "+value);
       });
//Alex - 1
//John - 2
//Amanda - 2


    }







}
  /*
        Find the number of these a word /number got repeated
            Example1:
                Input:5,3,4,1,3,7,2,9,9,4
                output:1-1,2-1,3-2,4-2,5-1,7-1,9-2
            Example2:
                Input:"Amanda","John","Alex","Amanda","John"
                Output: John-2 ,Alex-1  ,Amanda-2
     */
