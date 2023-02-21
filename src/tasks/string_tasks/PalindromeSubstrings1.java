package tasks.string_tasks;

public class PalindromeSubstrings1 {

    public static void main(String[] args) {
        //Im gonna create checkPalindrom method first
        System.out.println(palindromeSubstrings("abbaeae"));
//aa aaa aba aea bab bb bbb beb eae ebe ee eee

    }
    public static String palindromeSubstrings(String str){
        String[] arr=str.split("");
String result="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length ; j++) {
              if(checkPalindrom(arr[i]+arr[j]))  {
                  if(!result.contains(arr[i]+arr[j])){
                      result+=arr[i]+arr[j]+" ";
                  }else{
                      continue;
                  }

              }

                for (int k = 0; k < arr.length; k++) {
                    if(checkPalindrom(arr[i]+arr[j]+arr[k]))  {
                        if(!result.contains(arr[i]+arr[j]+arr[k])){
                            result+=arr[i]+arr[j]+arr[k]+" ";
                        }else{
                            continue;
                        }

                    }
                }
            }
        }
return result;
    }

    public static boolean checkPalindrom(String word){
        String reversed="";
            for (int i = word.length()-1; i>=0 ; i--) {
                reversed+=word.charAt(i);
                if(word.equalsIgnoreCase(reversed)){
                    return true;
                }
            }

        return false;
    }

}
