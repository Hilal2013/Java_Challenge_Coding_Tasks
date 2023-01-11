package tasks.array_tasks;

import java.util.Arrays;

public class CountFrequencies {

    public static void main(String[] args) {
       String[] chars={"a","a", "b","b","c","c","c"};
        countFrequency(chars);
    }

    public static void countFrequency(String[] chars) {

        String str = "";

        for (String each : chars) {
            if (!str.contains(each)) {
                int count = 0;

                for (String element : chars) {
                    if (each.equals(element)) {
                        count++;
                    }
                }
                if (count == 1) {

                    str += each;
                    continue;
                } else {
                    str += each + count;
                }
            }
        }
        System.out.println("str = " + Arrays.toString(str.split("")));
        System.out.println(str.split("").length);
    }

}
  /*
    Example 1:
        Input: chars = ["a","a", "b","b","c","c","c"]
        Output: Return 6, and the first 6 characters of the input array should be: ["a", "2", "b","2","c","3"]
            Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
    Example 2:
        Input: chars = ["a"]
        Output: Return 1, and the first character of the input array should be: ["a"]
        Explanation: The only group is "a", which remains uncompressed since it's a single character.
    Example 3:
        Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
        Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
        Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
     */