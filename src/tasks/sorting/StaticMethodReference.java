package tasks.sorting;

public class StaticMethodReference {

    public static void main(String[] args) {
        Thread thread1 = new Thread(StaticMethodReference::printMessage);
      // Thread thread1 = new Thread(() -> printMessage());
    //it will shorten my lambda experience
        thread1.start();
        Thread thread2 = new Thread(StaticMethodReference::printMessage);
        thread2.start();
    }

    private static void printMessage() {
        System.out.println("Hello!");
    }
}