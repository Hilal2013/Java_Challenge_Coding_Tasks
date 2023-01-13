package tasks.string_tasks;

public class ReverseSecondWord {
    public static void main(String[] args) {
        System.out.println(reverseSecondWord("I Love Java"));
    }
    public static String reverseSecondWord(String sentence) {
        String[] arr = sentence.split(" ");
        String reverse = "";
        for (int i = 0; i < arr.length; i++) {
           if(i==1){
               for (int j = arr[1].length() - 1; j >= 0; j--) {
                   reverse+=arr[1].charAt(j);
               }
           }else{
               reverse+=" "+arr[i]+" ";
           }
        }

       return reverse.trim();
    }
//Muhtar solution
public static String reverseSecondWord1(String sentence) {
    String[] words = sentence.split(" ");
    String reversed = "";

    for (int i = words[1].length() - 1; i >= 0; i--){
        reversed += words[1].charAt(i);
    }

    words[1] = reversed;
    String result = "";

    for (String each : words) {
        result += each + " ";
    }

    return result.trim();
}

}
 /*
    Reverse the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
     */

