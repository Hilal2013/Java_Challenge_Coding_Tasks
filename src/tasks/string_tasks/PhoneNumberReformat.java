package tasks.string_tasks;

import java.util.Arrays;
import java.util.Collections;

public class PhoneNumberReformat {
    public static void main(String[] args) {
        System.out.println(solution("55537265412"));//"004-448-555-583-61"
        System.out.println(checkString("1- -"));

    }
    public static String solution(String str) {
        // for all condtions restrisctions Imgonna create checkString method

        String result = "";
        //remove all specials and space
        str = str.replace("-", "");
        str = str.replace(" ", "");//00444855558361
        if (str.length() % 3 == 0) {
            for (int i = 0, j = 0; i < str.length(); i++) {
                result += str.charAt(i);
                j++;//when j=3 add "-"
                if (j == 3) {
                    result += "-";
                    j = 0;//j wll start from 0
                }
            }
            result = result.substring(0, result.lastIndexOf('-'));// it  will end "-"and remove

        } else if (str.length() % 3 > 1 || str.length() % 3 == 1) {
            for (int i = 0, j = 0; i < str.length(); i++) {
                result += str.charAt(i);
                j++;
                if (j == 3) {
                    result += "-";
                    j = 0;
                }
            }
        }
        return result;
    }
    public static boolean checkString(String s){
        int frequency =0;
        for (char each : s.toCharArray()) {
          if (Character.isDigit(each)) {
                frequency++;
            }

        }

        if(s.length() >= 2 && s.length() <100 && frequency>1 ){





        }



     return false;
    }




}
 /*
    We are given a string S representing a phone number, which we would like to reformat.
    String S consists of N characters: digits, spaces and/or dashes.
    It contains at least two digits. Spaces and dashes in string S can be ignored.
    We want to reformat the given phone number in such a way that the digits are grouped in blocks of length
    three, separated by single dashes. If necessary, the final block or the last two
    blocks can be of length two.
    For example, given string S = "00-44 48 5555 8361", we would like to
    format it as "004-448-555-583-61".
    Write a function:
            class Solution { public String solution (String s); }
    that, given a string S representing a phone number, returns this phone number
    reformatted as described above.
    For example, given S = "00-44 48 5555 8361", the function should return "004-448-555-583-61".
    Given S = "O 22 1985--324", the function should return "022-198-53-24".
    Given S = "555372654", the function should return "555-372-654".
    Assume that:
        • N is an integer within the range [2..100];
        • string S consists only of digits (0-9), spaces and/or dashes (-);
        • string S contains at least two digits.
    In your solution, focus on correctness. The performance of your solution will
     not be the focus of the assessment.

boolean length = s.length() >= 2 &&s.length() <100 ;
        boolean hasLetter = false;  // has Upper case letter
        boolean hasDigit = false;  // has Digit
        boolean hasSpecialChars = false; // has Special Character

        for (char each : s.toCharArray()) {
         int count= Collections.frequency(Collections.singleton(s.toCharArray()),each);
            if(!Character.isLetter(each)){
                hasLetter = true;
            }else if(Character.isDigit(each)&& count>1){
                hasDigit = true;
            }else{
                hasSpecialChars = true;
            }

        }

        return  length && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChars;
         int countLetter = 0;
        int countDigit = 0;
        int countSpecial = 0;
        int countSpace = 0;

        for (char each : password.toCharArray()) {
            if (Character.isLetter(each)) {
                countLetter++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            } else if (Character.isWhitespace(each)) {
                countSpace++;
            } else {
                countSpecial++;
            }
        }


        if (countDigit < 1 || countLetter < 1 || countSpecial < 1 || countSpace > 0) {
            isStrongPassword = false;
        }
        return isStrongPassword;




     */
