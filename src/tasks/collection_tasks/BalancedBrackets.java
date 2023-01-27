package tasks.collection_tasks;

import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {


        String chars="{([]))}";
        boolean result=  balanced(chars);
        System.out.println(result);
    }

    private static boolean balanced(String chars) {

        if (chars.length()%2!=0)
            return false;

        Stack<Character> stack=new Stack<>();
        try {
            for (int i = 0; i < chars.length(); i++) {
                char ch=chars.charAt(i);
                if (ch=='(' || ch=='[' || ch=='{'){
                    stack.push(ch);
                }
                else {
                    /*
                    peek is getting the last element without removing
                    pop is getting the element with removing
                     */
                    if (stack.peek()=='('&&ch==')') {
                        stack.pop();
                    }
                    if (stack.peek()=='['&&ch==']') {
                        stack.pop();
                    }

                    if (stack.peek()=='{'&&ch=='}') {
                        stack.pop();
                    }

                }

            }
        } catch (Exception e) {
            return  false;
        }
        return   stack.isEmpty();

    }
}
   /*
For compiler one of the most important task is balanced brackets
          * Create a method that will accept a String of brackets. Determine if the brackets are balanced.
          Brackets are balanced if the closing bracket matches the opening one.
          Ex: {([])} -> balanced
              {[(])} -> not balanced
*/