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