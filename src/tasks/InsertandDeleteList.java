package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertandDeleteList {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
      //  int list1=scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            int numbers=scan.nextInt();
            list.add(numbers);
        }
        System.out.println(list);
       int turn=scan.nextInt();
        for (int i = 0; i <turn ; i++) {
            System.out.println("Please enter what do you want?");
            String operator=scan.next().toLowerCase();
            if(operator.equals("insert")){
                System.out.println("to which index will you insert?");
                int index= scan.nextInt();
                System.out.println("What number do you want to insert?");
                int insert=scan.nextInt();
                if(list.size()<=index){
                    list.add(insert);
                }else{
                    for (int j = 0; j < list.size(); j++) {
                        if (j==index){
                            list.add( j,insert);
                            continue;
                        }
                    }
                }
            }
            if(operator.equals("delete")){
                System.out.println("which index will you delete?");
                int index= scan.nextInt();
                for (int j = 0; j < list.size(); j++) {
                    if (j==index){
                        list.remove(j);
                        continue;
                    }

                }
            }
        }
        System.out.println(list);
    }
}
/*

 */