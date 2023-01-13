package tasks.array_tasks;

public class Array2DReverse {
    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        String result = "";

        for (int i = 0; i < numbers.length; i++) {
            if (i == 1) {
                for (int j = numbers[1].length - 1; j >= 0; j--) {
                    result+=numbers[1][j]+" ";

                }
            }else{
                for (int j = 0; j <= numbers.length; j++) {
                    result+=numbers[i][j] +" ";

                }
            }
        }

        System.out.println(result);//1 2 3 4 8 7 6 5 9 10 11 12
    }
}
