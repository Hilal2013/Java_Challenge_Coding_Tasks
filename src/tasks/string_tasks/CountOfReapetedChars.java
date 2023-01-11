package tasks.string_tasks;

public class CountOfReapetedChars {
    public static void main(String[] args) {
        System.out.println(countReapetedChars("aabcccddaaaa"));//a2b1c3d2a4


    }

    public static String countReapetedChars(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == each) {
                    frequency++;
                }
            }
            if (result.contains("" + each)) {
                continue;
            }
            result += each + "" + frequency;
        }
        return result;
    }

}
/*
        Write a method that compresses a string based on the count of repeated characters. aabcccddaaaa -->  a2b1c3d2a4
     */
