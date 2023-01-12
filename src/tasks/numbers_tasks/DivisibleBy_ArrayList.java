package tasks.numbers_tasks;

import java.util.ArrayList;

public class DivisibleBy_ArrayList {
    public static ArrayList<Integer> divisibleBy3 = new ArrayList<>();
    public static ArrayList<Integer> divisibleBy5 = new ArrayList<>();
    public static ArrayList<Integer> divisibleBy15 = new ArrayList<>();

    public static void method() {
        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {
                divisibleBy15.add(i);
            } else if (i % 3 == 0 && i % 5 != 0) {
                divisibleBy3.add(i);
            } else if (i % 3 != 0 && i % 5 == 0) {
                divisibleBy5.add(i);
            }
        }
    }

    public static void main(String[] args) {
        method();
        System.out.print("Divisible By 15:");
        for (Integer each : divisibleBy15) {
            System.out.print(" " + each);//Divisible By 15: 15 30
        }
        System.out.println();
        System.out.print("Divisible By 5:");
        for (Integer each : divisibleBy5) {
            System.out.print(" " + each);//Divisible By 5: 5 10 20 25
        }
        System.out.println();
        System.out.print("Divisible By 3:");
        for (Integer each : divisibleBy3) {
            System.out.print(" " + each);//Divisible By 3: 3 6 9 12 18 21 24 27
        }
    }
}
