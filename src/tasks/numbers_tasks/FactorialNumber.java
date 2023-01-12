package tasks.numbers_tasks;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(factorialNumber(5));
    }
    public static int factorialNumber(int number) {
        int result=1;
        for (int i = number; i>=1 ; i--) {
            result*=i;
        }

     return  result;
    }
//Muhtar solution
public static int factorialNum(int n) {

    int result = 1;

    for (int i = 1; i <= n; i++) {
        result = result * i;
    }

    return result;

}

}
    /*
    Write a return method that returns the factorial number of any given number
        Ex:
                Input: 5
                outPut: 120
                because 5 * 4 * 3 * 2 * 1 = 120
     */