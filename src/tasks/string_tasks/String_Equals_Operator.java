package tasks.string_tasks;

public class String_Equals_Operator {
    public static void main(String[] args) {
        String str1="Java";
        String str2[]={"J","a","v","a"};
        String str3="";
       // String str3=str1; System.out.println(str1==str3); //true
        for (int i = 0; i < str1.length(); i++) {
            str3=str3+str2[i];

        }

        System.out.println(str1==str3); //false
        System.out.println(str1.equals(str3)); //true

    }
}
/*
 for (int i = 0; i < str1.length(); i++) {
            str3=str3+str2[i];

        }
 */