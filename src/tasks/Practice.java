package tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
        list.add(1,30);
        System.out.println(list);//[10, 30, 20, 30, 40]
        list.remove(2);
        System.out.println(list);//[10, 30, 30, 40]


    }
}
