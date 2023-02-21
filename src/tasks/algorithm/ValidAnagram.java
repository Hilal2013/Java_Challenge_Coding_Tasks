package tasks.algorithm;

import java.util.Arrays;
import java.util.TreeSet;

public class ValidAnagram {
    public static void main(String[] args) {
        String s= "anagram", t="nagaram";
        System.out.println(checkAnagram(s,t));
        System.out.println(checkAnagramWithSet(s,t));
    }
//solution one
    public static boolean checkAnagram(String s, String t){
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            return true;
        }
        return false;
//time complexity O(n(log n))
    }
    //solution two
    public static boolean checkAnagramWithSet(String s, String t) {
        TreeSet<String> set1=new TreeSet<>(Arrays.asList(s.split("")));
       //keeps sorted orde and doesnt allow duplicates
        TreeSet<String> set2=new TreeSet<>(Arrays.asList(t.split("")));
        System.out.println(set1);//[a, g, m, n, r]
        if(set1.equals(set2)){
            return true;
        }else{
            return false;
        }
    }

//time complexity O(n(log n))
}
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.
Constraints:
 1 <= s.length, t.length <= 5 * 104
 s and t consist of lowercase English letters.
Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to
such a case?
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
 */