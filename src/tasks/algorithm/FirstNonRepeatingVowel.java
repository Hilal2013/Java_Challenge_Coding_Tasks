package tasks.algorithm;

public class FirstNonRepeatingVowel {
    public static void main(String[] args) {
        String str="google";

        System.out.println(findFirstNonRepeatVowel(str));

    }

    public static int findFirstNonRepeatVowel(String str){
    int index=0;

      //  str=str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {// to access every character for loop//check and compare nested loop
            int frequency=0;//first iteration will be 'g'//inner loop
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    if(checkVowel(str.charAt(i))){//created checkvowel method at the bottom
                        frequency++;//if character is vowel  frequency will increase
                    }
                }
            }
            if(frequency==1){//if character non repeating assign its index(i) and exit
                index=i;
                return index;
            //    break;
            }

        }
        return -1;
    }
   public static boolean checkVowel(char ch){
        if(ch=='a' ||ch=='e'||ch=='i'||ch=='o'||ch=='u' ){
            return true;
        }
        return false;
   }

}
/*
Given a string, write a method to find the first non-repeating vowel (a, e, i, o, u) in it and
return its index. If it doesn't exist, return -1. Assume that all the characters of the String is
lowercase.
( Do not use String class functions other than charAt() and length()




 */