package tasks.string_tasks;

import java.util.HashMap;
import java.util.Map;

public class BalancedStrings {

    public static void main(String[] args) {

        String s="RLRRLLRLRL";
        System.out.println(balancedStringSplit(s));
    //    System.out.println(balancedStringSplitWithMap(s));
    }
    public static int balancedStringSplit(String s){
      int balancedSubstringsCount=0;
int letterCount=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='L'){
                letterCount++;
            }else{
                letterCount--;
            }
            if(letterCount==0){
                balancedSubstringsCount++;
            }
        }

return balancedSubstringsCount;
    }
    //solution two
    /*
    public static int balancedStringSplitWithMap (String s) {

        Map<Integer,Integer> map = new HashMap<>();
        int result = 0;

        for(Map.Entry<Integer,Integer> eachEntry: map.entrySet()){
            int eachKey = eachEntry.getKey();
            int eachValue = eachEntry.getValue();
            result=(eachKey%2==0)?eachValue+result:result;
        }




    }

    */

}
/*
Balanced strings are those that have an equal quantity of 'L' and 'R' characters.

Given a balanced string s, split it into some number of substrings such that:

Each substring is balanced.
Return the maximum number of balanced strings you can obtain.
Example 1:

Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
 */