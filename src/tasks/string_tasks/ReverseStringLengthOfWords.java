package tasks.string_tasks;



public class ReverseStringLengthOfWords {
    public static void main(String[] args) {
        String str="I am from California";
        System.out.println(reverse(str));//a in rofi laCmorfmaI

    }

    public static String reverse(String str) {
// array[i] size
String[] arr=str.split(" ");//[I, am, from, California]
        String result = "";
        str = str.replaceAll("\\s","");
        String reverse=new StringBuilder(str).reverse().toString();
        System.out.println(reverse);//ainrofilaCmorfmaI
        for (int i = 0; i< arr.length; i++) {
           result+=reverse.substring(0, arr[i].length())+" ";
           reverse=reverse.substring(arr[i].length());
        }


     return result;


    }
}
//String str="I am from California"           output    ="a in rofi IaCmorfmaI"