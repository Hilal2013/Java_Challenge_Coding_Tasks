package tasks.string_tasks;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCCDEF"));//DEF

    }
    public static String uniqueChars(String str){
String unique="";
        for (int i = 0; i <str.length() ; i++) {
            int frequency=0;
            for (int j = 0; j <str.length() ; j++) {
               if(str.charAt(i)==str.charAt(j)){
                   frequency++;
               }
            }
           if(frequency==1){
               unique+=""+str.charAt(i);
           }
        }
        return unique;
    }
//Muhtar solution
public static String unique(String str) {
    String[] arr = str.split("");
    String unique1 = "";

    for (int j = 0; j < arr.length; j++) {
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(arr[j])) {
                num++;
            }
        }
        if (num == 1) {
            unique1 += arr[j];
        }
    }

    return unique1;
}



}
/*
    Write a return method that can find the unique characters from the String
            Ex: unique("AAABBBCCCDEF") ==> "DEF";
     */
