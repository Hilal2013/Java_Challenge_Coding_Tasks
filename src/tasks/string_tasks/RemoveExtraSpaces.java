package tasks.string_tasks;

public class RemoveExtraSpaces {
    public static void main(String[] args) {

        System.out.println(removeExtraSpaces( "  Hello world      I      love      Java    "));

    }
    public static String removeExtraSpaces(String sentence){
        //result=sentence.replace(" ",""); HelloworldIloveJava
        String[] arr=sentence.trim().split(" ");
        String result = "";
        for (String each : arr) {
            if (!each.isEmpty()) {
                result += each + " ";
            }
        }


        return result.trim();
    }

}
 /*
    Remove All Extra Space from String
        Input: "  Hello world      I      love      Java    "
        Output: Hello world I love Java
     */
