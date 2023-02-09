package tasks.string_tasks;

import java.util.Arrays;
import java.util.Collections;

public class CountUniqueChars {
    public static void main(String[] args) {

        System.out.println(countUnique("aabbbbbccccc"));//-1

    }
public static int countUnique(String str){
 int count=0; //unique character's count

    for (int i = 0; i <str.length() ; i++) {
        int frequency=0;
        for (int j = 0; j <str.length() ; j++) {
            if(str.charAt(i)==str.charAt(j)){
                frequency++;
            }
        }
        if(frequency==1){

            count++;
        }
    }
    if(count==0){
        return -1;
    }

  return count;
}
    //solution 2
    public static int countUniqueChars2(String str){
        int count = 0;
        for (String each : str.split("")) {
            int f = Collections.frequency(Arrays.asList(str.split("")) , each);
            if(f==1) {
                count++;
            }
        }
        return (count==0)? -1 : count;
    }
}
   /*
        Write a Java program to count unique Characters in string.
        Given a string as input, write Java code to count and print the number of unique characters in String.
        If there are no unique characters in the string, the method returns -1
     */