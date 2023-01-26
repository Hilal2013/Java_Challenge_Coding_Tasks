package tasks.string_tasks;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {

        String s ="abcabcbbd";
        System.out.println(lengthOfSubstring(s));//abcd//4
    }

    public static int lengthOfSubstring(String s){

        String result= "";

        for(int i =0; i<s.length(); i++){
            char ch =s.charAt(i);
            int frequency =0;
            for (int j = 0; j < s.length(); j++) {
                if(ch == s.charAt(j)){
                    frequency++;
                }
            }
            if(frequency == 1){
                result += ch;
            }else if (frequency > 1 && (!result.contains(ch +""))){
                result += ch;
            }
        }

        System.out.println(result);

        return result.length();
    }
}
