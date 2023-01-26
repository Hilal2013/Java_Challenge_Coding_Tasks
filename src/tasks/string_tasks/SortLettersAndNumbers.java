package tasks.string_tasks;

import java.util.Arrays;

public class SortLettersAndNumbers {
    public static void main(String[] args) {

        String str = "DC501GCCCA098911";
        sortLettersAndNumbers(str);//CD015ACCCG011899

    }

    public static void sortLettersAndNumbers(String str) {

        char[] arr = str.toCharArray();//to seperate charecters to use Character.isLetter etc..

        String result = "";
        for (int i = 0; i < arr.length - 1; i++) {//first imm gonna seperate letters and digits through comma
            result += arr[i];
            if (Character.isLetter(arr[i]) && Character.isDigit(arr[i + 1])) {
                result += ",";//if there is digit after letter add comma

            } else if (Character.isDigit(arr[i]) && Character.isLetter(arr[i + 1])) {
                result += ",";////if there is letter after digit add comma

            }

        }
        System.out.println(result);//DC,501,GCCCA,098911 //missing the last character//create loop and add last chracter to result
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                result+=""+arr[arr.length-1];
            }
        }

        System.out.println(result);//DC,501,GCCCA,098911
        //for sort im gonna create array through split
        String[] arr1 = result.split(",");
        System.out.println(Arrays.toString(arr1));//[DC, 501, GCCCA, 098911]
        String resultSort = "";
        for (int i = 0; i < arr1.length; i++) {//to access every index
            for (int j = 0; j < arr1[i].length(); j++) {//to access element for each index
                //to access each element in index and create new array for each index through split
                String[] arr2 = arr1[i].split("");
                Arrays.sort(arr2);//D,C will be C,D
                resultSort += arr2[j];//CD
            }
        }
        System.out.println(resultSort);//CD015ACCCG011899

    }

}
  /*
    Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers,
    sort the individual string and append them back together
        Ex:
            Input: "DC501GCCCA098911"
            Output: "CD015ACCCG011899"
     */