package tasks.string_tasks;

public class CountOfRepeatedChars {
    public static void main(String[] args) {
        System.out.println(countReapetedChars("aabcccddaaaa"));//a2b1c3d2a4


    }
//solution one
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
    //solution two
    public static String solution(String str){
        String result = "";
        int count = 0;
        char temp = str.charAt(0);

        for (char c : str.toCharArray()) {
            if(temp == c) {
                count++;
            } else {
                result +=  ""+temp + count;
                temp = c;
                count = 1;
            }
        }
        result += ""+temp + count;

        return result;
    }



}
/*
        Write a method that compresses a string based on the count of repeated characters. aabcccddaaaa -->  a2b1c3d2a4
     */
