package tasks.algorithm;

public class CountDuplicatedChars {
    public static void main(String[] args) {
        String word="aA11";
countDuplicatedChars(word);
    }


private static void countDuplicatedChars(String word){

String[] arr=word.split("");
String result="";

    for (int i = 0; i < arr.length; i++) {
        int frequency=0;
        for (int j = 0; j < arr.length; j++) {
            if(arr[i].equalsIgnoreCase(arr[j])){
                frequency++;
            }
        }
        if(frequency>1){
            result+=frequency +" # '"+ arr[i]+"'";
        }
    }
    System.out.println(result);
}

}
/*
Question-1 Count the number of Duplicated Chars
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.
Example:
"abcde" -> 0 # no characters repeats more than once.
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times.
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice.
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice.
        String word="Indivisibilities";

 */