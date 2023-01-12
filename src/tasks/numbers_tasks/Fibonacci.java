package tasks.numbers_tasks;

public class Fibonacci {
    public static void main(String[] args) {
        int sum=0;
        int previousNumber=0;
        int nextNumber=1;
//1 1 2 3 5 8 13
        for (int i = previousNumber,k=nextNumber; i<100 ;i++,k++) {
            sum=previousNumber+nextNumber;//0+1=1 //1+1=2// 1+2//2+3//3+5
            previousNumber=nextNumber;//1//1//2//3//5
            nextNumber=sum;//next number=1//2//3//5//8
            System.out.print(previousNumber+" ");//1 1 2 3 5 8


        }

    }
    //Muhtar solution
    public static int fibonacci(int num) {

        int result = 0;
        int j = 0;
        int z = 1;

        for (int i = 1; i < num; i++) {
            result = j + z;
            j = z;
            z = result;
        }

        return result;
    }
}
