package tasks.string_tasks;

public class Reverse {
    public static void main(String[] args) {

        System.out.println(reverseString("ABCD"));//DCBA

reverseString1("ABCD");
    }

    public static String reverseString(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse+=str.charAt(i);
          //  reverse += str.toCharArray()[i];
        }
        return reverse;

    }
//solution two
    public static void reverseString1(String str) {

StringBuilder stringBuilder=new StringBuilder(str);
       stringBuilder.reverse();
        System.out.println(stringBuilder);//DCBA


    }

}

    /*
    Write a function that can reverse String
        Ex: Reverse("ABCD"); ==> DCBA
     */