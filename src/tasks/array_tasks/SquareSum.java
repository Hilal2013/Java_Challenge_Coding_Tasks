package tasks.array_tasks;

public class SquareSum {
    public static void main(String[] args) {
        int[] n={1,-3,2};
        System.out.println(squareSum(n));
    }
    public static int squareSum(int[] n){
        int result=0;
        for (int i = 0; i < n.length; i++) {
result+= Math.pow(n[i],2);
        }
        return result;
    }


}
    //Complete the square sum function so that it squares each number passed into it and then sums the results together.
//For example, for [1, 2, 2] it should return 9 because
