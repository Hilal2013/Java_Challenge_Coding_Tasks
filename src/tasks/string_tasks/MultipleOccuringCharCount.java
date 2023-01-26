package tasks.string_tasks;

public class MultipleOccuringCharCount {

    public static void main(String[] args) {
        String str = "Individualities";
str=str.toLowerCase();
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == each) {
                    frequency++;
                }
            }
            if(frequency>1){
                if (result.contains("" + each)) {
                    continue;
                }else{
                    result+=each;
                }
            }
        }
        System.out.println(result);//id
        System.out.println(result.length());//id//2



    }
}
/*
Task: MultipleOccuringCharCount
Write a function that will return the count of distinct case-insensitive alphabetic characters that occur more than once in the input string. The input string can be assumed to
contain only alphabets (both uppercase and lowercase).

Example 1:
Input: “sample”
Output: 0
Explanation: No characters repeat more than once.
 */