package tasks.string_tasks;

public class MostFrequentWord {
    public static void main(String[] args) {
      //  String str = "How many times any word repeated  many times in this sentence";
        System.out.println(findMostFreuquentWord("How many times any word repeated many many times in this sentence"));

    }
    public static String findMostFreuquentWord(String str){
        String word="";
        String[] arr=str.split(" ");
int maxFrequency=0;
        for (int i = 0; i < arr.length; i++) {
            int frequency=0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i].equalsIgnoreCase(arr[j])){
                    frequency++;
                }
            }
            if(maxFrequency<frequency){
                maxFrequency=frequency;
                word=arr[i];
            }
        }

      return word;
    }

}
// write a program that finds the  highest number of times repeated word in a string.
/*
Map<String, Integer> unSortedMap = new LinkedHashMap<>();

        for (String each : arr) {
            int frequency = Collections.frequency(Arrays.asList(arr), each);
            unSortedMap.put(each, frequency);
        }

        Map<String, Integer> reverseSortedMap = new LinkedHashMap<>();

        unSortedMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        System.out.println("Unsorted Map : " + unSortedMap);
        System.out.println("Reverse (descending order) Sorted Map   : " + reverseSortedMap);

 */