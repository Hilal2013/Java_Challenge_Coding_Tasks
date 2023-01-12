package tasks.string_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestPalindrom {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("level noon Aibohphobia madam racecar"));

      // System.out.println(checkPalindrom("level"));

    }
    public static String longestPalindrome(String str){
// I created checkPalindrom() method
        int maxLength=0;
        String longestPalindrom="";
        String[] arr=str.split(" ");
        for (int i = 0; i < arr.length; i++) {

            if(checkPalindrom(arr[i])){
                if (arr[i].length()>maxLength){
                    maxLength=arr[i].length();
                    longestPalindrom=arr[i];
                }
            }

        }

        return longestPalindrom;
    }
public static boolean checkPalindrom(String word){
        String reversed="";
    for (int i = 0; i <word.length() ; i++) {
        for (int j = word.length()-1; j>=0 ; j--) {
            reversed+=word.charAt(j);
            if(word.equalsIgnoreCase(reversed)){
                return true;
            }

        }
    }
       return false;
}
    //Solution 2: Muhtar (easier but involves using data structure)
    public static String longestPalindrome1(String str) {
        String longest = "";
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            for (int j = i + 1; j < str.length(); j++) {
                list.add(str.substring(i, j));
            }

        }

        for (String each : list) {

            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse) && each.length() > longest.length()) {
                longest = each;
            }

        }

        return longest;
    }


    // solution 3: Harder but does not need a data structure
    public String longestPalindrome2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i = i + 1) {
            int b = i;
            int e = i;
            while (b >= 0 && e <= str.length() - 1 && str.charAt(b) == str.charAt(e)) {
                b--;
                e++;
            }
            String temp = str.substring(b + 1, e);
            if (temp.length() > result.length()) result = temp;


            b = i; // for even length palindromes
            e = i + 1;
            while (b >= 0 && e <= str.length() - 1 && str.charAt(b) ==
                    str.charAt(e)) {
                b--;
                e++;
            }
            temp = str.substring(b + 1, e);
            if (temp.length() > result.length()) {
                result = temp;
            }
        }

        return result;
    }

}
 /*
    Write a program that can return the longest palindrome from a string
     */