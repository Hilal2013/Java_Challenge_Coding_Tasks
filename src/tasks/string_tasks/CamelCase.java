package tasks.string_tasks;

import java.util.Arrays;

public class CamelCase {
    public static void main(String[] args) {

        System.out.println(CamelCase("cats AND*Dogs-are Awesome"));//CatsAndDogsAreAwesome

    }
    public static String CamelCase(String str) {

        for (int i = 0; i < str.length(); i++) {//if each=special character replace with space char
            char each = str.charAt(i);
            if (!Character.isLetterOrDigit(each)) {
                str = str.replace(each, ' ');
            }
        }
        System.out.println(str);//cats AND Dogs are Awesome
        String[] arr = str.split(" ");
        String result="";
        for (int i = 0; i < arr.length; i++) {
            result+= arr[i].substring(0, 1).toUpperCase() +
                    arr[i].substring(1).toLowerCase();

        }
        return result;
    }
//solution two
public static String camelCase(String s){
    String[] words = s.replaceAll("\\p{Punct}", " ").toLowerCase().split("\\s+");
    StringBuilder result = new StringBuilder();
    result.append(words[0]);
    for (int i = 1; i < words.length; i++) {
        result.append(words[i].substring(0,1).toUpperCase()).append(words[i].substring(1));
    }
    return result.toString();
}
//solution three
    /*
String str1 = "BOB loves-coding";
    String str2 = "cats AND*Dogs-are Awesome";
    String str3 = "a b c d-e-f%g";

        System.out.println(CamelCase(str1));
        System.out.println(CamelCase(str2));
        System.out.println(CamelCase(str3));

     */
}


 /*
    Camel Case
    Have the function Camel Case (str) take the str parameter being passed and return it in proper
    camel case format where the first letter of each word is capitalized (excluding the first letter).
    The string will only contain letters and some combination of delimiter punctuation characters separating each word.
        For example:
            if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
        Examples
            Input: "cats AND*Dogs-are Awesome"
            Output: catsAndDogsAreAwesome
            Input: "a b c d-e-f%g"
            Output: aBCDEFG
     */
 