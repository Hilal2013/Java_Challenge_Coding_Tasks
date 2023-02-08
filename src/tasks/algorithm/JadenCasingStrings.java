package tasks.algorithm;

import java.util.Arrays;

public class JadenCasingStrings {
    public static void main(String[] args) {
      String str=  "How can mirrors be real if our eyes aren't real";
convertCapitalFirstLetters(str);
    }

    public static void convertCapitalFirstLetters(String str){

        String result="Jaden-Cased: ";

        String[] arr=str.split(" ");

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
        result+= arr[i].substring(0,1).toUpperCase()+arr[i].substring(1)+" ";
        }
        System.out.println(result.trim());
//second solution
        Arrays.stream(arr)
                .map(i->i.substring(0,1).toUpperCase()+i.substring(1)+" ")
                .forEach(System.out::print);


    }

}
/*
Jaden Smith, the son of Will Smith, is the star of films such as The Karate Kid (2010) and After
Earth (2013). Jaden is also known for some of his philosophy that he delivers via Twitter.
When writing on Twitter, he is known for almost always capitalizing every word. For
simplicity, you'll have to capitalize each word, check out how contractions are expected to
be in the example below.
Your task is to write a method that converts strings to how they would be written by Jaden
Smith. The strings are actual quotes from Jaden Smith, but they are not capitalized in the
same way he originally typed them.
Note that this function should a return empty string for an empty string or null.
Example:
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased: "How Can Mirrors Be Real If Our Eyes Aren't Real"
 */