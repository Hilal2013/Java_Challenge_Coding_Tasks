package tasks.string_tasks;

public class PalindromeSubstrings {

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
        for (int i = 0; i <word.length() ; i++) {
            for (int j = word.length()-1; j>=0 ; j--) {
                reversed+=word.charAt(j);
                if(word.equalsIgnoreCase(reversed)){
                    return true;
                }

            }
        }
        return false;
    }

}
/*
Input : str = "abaab"
Output: 3
Explanation :
All palindrome substring are :
 "aba" , "aa" , "baab"

Input : str = "abbaeae"
Output: 4
Explanation :
All palindrome substring are :
"bb" , "abba" ,"aea","eae"
 */