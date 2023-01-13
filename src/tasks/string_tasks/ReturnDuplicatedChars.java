package tasks.string_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReturnDuplicatedChars {
    public static void main(String[] args) {
        System.out.println(duplicatedChars("inteerrrviiew"));//ier

    }
    public static String duplicatedChars(String str){
        String result = "";
        for (int i = 0; i <str.length() ; i++) {
            int frequency=0;
            char ch1=str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch2=str.charAt(j);
                if(ch1== ch2){
                    frequency++;
                }
            }
            if(frequency>1 && !result.contains(""+ch1)  ){
                result += ch1;
            }
        }
        return result;
    }
    //Muhtar solution
    public static String test2(String str){
        List<String> list = new ArrayList<>();
        String[] arr = str.split("");
        Arrays.stream(arr).distinct().forEach(a -> {  if( Arrays.stream(arr).filter(b -> b.equals(a)).count()>1){ list.add(a);}} );
        return list.toString();
    }
}
