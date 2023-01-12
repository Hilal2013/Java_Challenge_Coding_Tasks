package tasks.numbers_tasks;

public class DivisibleBy_3_5_15 {
    public static void main(String[] args) {

        divide();

    }
    public static void divide() {
        String divisibleBy15 = "";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                divisibleBy15 += i + " ";
            }

            if (i % 5 == 0 && i % 15 != 0) {
                divisibleBy5 += i + " ";
            }

            if (i % 3 == 0 && i % 15 != 0) {
                divisibleBy3 += i + " ";
            }

        }

        System.out.println("Divisible by 15: " + divisibleBy15);
        System.out.println("Divisible by 5 = " + divisibleBy5);
        System.out.println("Divisible by 3 = " + divisibleBy3);


    }
}
