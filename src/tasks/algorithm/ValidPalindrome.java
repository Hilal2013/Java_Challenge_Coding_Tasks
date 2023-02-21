package tasks.algorithm;

public class ValidPalindrome {
    public static void main(String[] args) {
        String sentence="Do geese see God?";
        System.out.println(checkPalindrome(sentence));

    }

    public static boolean checkPalindrome(String sentence) {
        char[] ch = sentence.toCharArray();
        String result="";
        for (int i = 0; i < ch.length; i++) {
            if (Character.isLetter(ch[i])) {
                result += ch[i];
            }
        }
            System.out.println(result);//DogeeseseeGod

       return    result.equalsIgnoreCase(new StringBuilder(result).reverse().toString());

        }

}
/*
Write a function that accepts a string and determines whether it is a palindrome, ignoring nonalphanumeric characters and case and returns true if it is palindrome.
(A string is said to be palindrome if it reads the same backward as forward, after converting all
uppercase letters into lowercase letters and removing all non-alphanumeric characters).
Examples:
Input: Do geese see God? Output: True
Input: Was it a car or a cat I saw? Output: True
Input: A brown fox jumping over Output: False
Constraints:
• 1 <= s.length <= 2 * 105
• s consists only of printable ASCII characters
 */
 /*
            String reversed = "";
        for (int i = result.length()-1; i >=0; i--) {
            reversed += result.charAt(i);
            if (result.equalsIgnoreCase(reversed)) {
                return true;
            }
        }
            return false;


         */