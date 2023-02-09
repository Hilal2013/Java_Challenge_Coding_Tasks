package tasks.algorithm;

public class CountDuplicatedChars {
    public static void main(String[] args) {
        String word = "aAcdefaefF";
        System.out.println(countDuplicatedChars(word));


    }

    private static int countDuplicatedChars(String word) {
        int count = 0;
        String result = "";
        word=word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            char each = word.charAt(i);
            int frequency = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == each) {
                    frequency++;
                }
            }
            if (frequency > 1) {
                if (result.contains("" + each)) {
                    continue;
                }
                result += each;
                count++;
            }
        }

        return count;

    }
}