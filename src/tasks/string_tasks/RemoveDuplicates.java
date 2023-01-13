package tasks.string_tasks;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCCD"));//ABCD
    }

    public static String removeDup(String str){
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            char each=str.charAt(i);
            if(!result.contains(each+"")){
                result+=each;
            }else{
                continue;
            }
        }

      return  result;
    }


}
   /*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC
     */