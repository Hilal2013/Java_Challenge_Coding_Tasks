package tasks.collection_tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TimeSeries {
    public static void main(String[] args) {
        Map<Integer, Double> map1 = new HashMap<>();

        Map<Integer, Double> map2 = new HashMap<>();
    }


    public static Map<Integer, Double> solution(Map<Integer, Double> map1, Map<Integer, Double> map2){
        Map<Integer, Double> result = new HashMap<>();
        return result;
    }


}
   /*
    A time series is represented as a list of time/value pairs. Write a function whose input is two time series and whose output is a new time series of the summation of them.
        Example:
            series A: [(1, 1.0), (2, 1.5), (3, 2.0)]
            series B: [(2, 1.0), (3, 2.5), (5, 1.0)]
        Assuming we have '0' for a time pair that's missing, this is the result:
        output:
            [(1, 1.0), (2, 2.5), (3, 4.5), (5, 1.0)]
     */