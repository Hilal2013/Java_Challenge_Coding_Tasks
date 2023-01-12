package tasks.string_tasks;

import java.util.Arrays;
import java.util.TreeSet;

public class Anagram {
    public static void main(String[] args) {
        System.out.println(checkSame("abc","cca"));
        System.out.println(same("abc","def"));
    }
//solution one
public static boolean checkSame(String firstWord, String secondWord){
//solution one
    char[] ch1 = firstWord.toLowerCase().toCharArray(); // converts first word into lower case char array
    char[] ch2 = secondWord.toLowerCase().toCharArray();
    Arrays.sort(ch1);
    Arrays.sort(ch2);
    if(Arrays.equals(ch1,ch2)){
        return true;
    }
    return false;
}

/*
public static boolean same(String a, String b) {
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
    String a1 = "", a2 = "";
    for (char each : ch1) {
        a1 += each;
    }

    for (char each : ch2) {
        a2 += each;
    }

    if(a1.equals(a2)){
        return true;
    }else{
        return false;
    }

}

 */
//solution three
public static boolean same(String a, String b){

    TreeSet<String> a1=new TreeSet<>(Arrays.asList(a.split("")));
    TreeSet<String> b1=new TreeSet<>(Arrays.asList(b.split("")));

    System.out.println(a1);
    if(a1.equals(b1)){
        return true;
    }else{
        return false;
    }
}


}
 /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:
     */