package tasks.array_tasks;

public class firstDuplicatedElement {
    public static void main(String[] args) {
        int[] arr = {15, -2, -2, 23, 78, 0, 0, 78,23};
        System.out.println(findFirstDuplicatedElement(arr));//-2
    }

    public static int findFirstDuplicatedElement(int[] arr) {
        int firstDup = 0;
        for (int i = 0; i < arr.length; i++) {
            int frequency = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    frequency++;
                }
            }
            if (frequency > 1) {
                firstDup = arr[i];
                break;
            }
        }
        return firstDup;

    }


}
/*
    write a program that can find the first duplicated element from the array
     */