package tasks.string_tasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        System.out.println(frequencyOfCharacters("AAABBCDD"));//A3B2C1D2
        System.out.println(frequencyOfChars1("AABCDDD"));//A2B1C1D3
    }
    // solution 1
    public static String frequencyOfCharacters(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            int frequency=0;
            char each=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
           if(each==str.charAt(j)){
               frequency++;
           }
            }
            if(result.contains(""+each)){
                continue;
            }else{
                result+=each+""+frequency;
            }

        }
return result;
    }
    // solution 2
    public static String frequencyOfChars1(String str) {
        String nonDup = "", result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }
        for (int i = 0; i < nonDup.length(); i++) {
            int num = Collections.frequency(Arrays.asList(str.split("")), "" + nonDup.charAt(i));
            result += "" + nonDup.charAt(i) + num;
        }

        return result;
    }


    // solution 3
    public static String frequencyOfChars2(String str) {
        String nonDup = "";
        for (int i = 0; i < str.length(); i++) {
            if (!nonDup.contains("" + str.charAt(i))) {
                nonDup += "" + str.charAt(i);
            }
        }

        String expectedResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == nonDup.charAt(j)) {
                    count++;
                }
            }
            expectedResult += nonDup.charAt(j) + "" + count;
        }

        return expectedResult;
    }


    // solution 4
    public static String frequencyOfChars3(String str) {
        String b = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();
        b = b.replace(", ", "").replace("[", "").replace("]", "");
        String result = "";
        for (int j = 0; j < b.length(); j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals("" + str.charAt(j))) {
                    count++;
                }
            }

            result += b.substring(j, j + 1) + count;
        }

        return result;

    }


    //solution 5
    public static String frequencyOfChars4(String str) {
        String expectedResult = "";
        int j = 0;
        while (j < str.length()) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            expectedResult += str.charAt(j) + "" + count;
            str = str.replace("" + str.charAt(j), "");
        }
        return expectedResult;
    }

}
