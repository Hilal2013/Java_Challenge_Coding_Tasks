package tasks.string_tasks;

public class IndexOfFirstUniqueChar {
    public static void main(String[] args) {
        System.out.println(findIndexOfFirstUniqueChar("aaabbccddefff"));//9

    }
    public static int findIndexOfFirstUniqueChar(String str){
        int index=0;
        for (int i = 0; i < str.length(); i++) {
            int frequency=0;
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(i)==str.charAt(j)){
                    frequency++;
                }
            }
            if(frequency==1){
             index= str.indexOf(str.charAt(i));
             break;
            }else{
                index=-1;
            }
        }




        return index;


    }

}
  /*
    Given a string, find the first non-repeating character in it and return its index.
    If it doesn't exist, return -1.
     */