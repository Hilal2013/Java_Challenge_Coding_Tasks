package tasks.algorithm;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatedChars {
    public static void main(String[] args) {
        String word = "aAcd1efaefF1";//4
        System.out.println(countDuplicatedChars(word));


    }

    private static int countDuplicatedChars(String word) {//how many we have duplicated chars we will count
        int count = 0;
        String result = "";
        word=word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            int frequency = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == each) {
                    frequency++;
                }
            }
            if (frequency >1) {
                if (result.contains("" + each)) {
                    continue;
                }
                result += each+"";
                count++;
            }
        }

        return count;

    }
    //second solution
    public static int getNumber(String str) {
        String[] ch = str.toLowerCase().split("");
        String newString = "";
        for (String each : ch) {    //compare each
            int counter = 0;
            for (String result : ch) {
                if (result.equals(each)) {
                    counter++;
                }
            }
            if (counter > 1 && !(newString.contains(each))) {
                newString += each;
            }
        }
        return newString.length();
    }
    //third solution
    public static int getNumber2(String str) {
        str = str.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        for (Character ch : str.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        map.entrySet().removeIf(e -> e.getValue() == 1);
        return map.size();
    }


}
/*
Question-1 Count the number of Duplicated Chars
        Write a function that will return the count of distinct case-insensitive alphabetic characters
        and numeric digits that occur more than once in the input string.
        The input string can be assumed to contain only alphabets (both uppercase and lowercase)
        and numeric digits.
        Example:
        "abcde" -> 0 # no characters repeats more than once.
        "aabbcde" -> 2 # 'a' and 'b'
        "aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
        "indivisibility" -> 1 # 'i' occurs six times.
        "Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
        "aA11" -> 2 # 'a' and '1'
        "ABBA" -> 2 # 'A' and 'B' each occur twice.

        */