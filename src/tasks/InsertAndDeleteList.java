package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertAndDeleteList {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();//for your list size get from keyboard

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <size ; i++) {
            int numbers=scan.nextInt();//given numbers will be added to your list while for loop turns until its size
            list.add(numbers);
        }
        System.out.println(list);
       int turn=scan.nextInt();//how many times do you want
        for (int i = 0; i <turn ; i++) {
            System.out.println("Please enter what do you want?");
            String operator=scan.next().toLowerCase();//operator can be insert or delete
            if(operator.equals("insert")){
                System.out.println("to which index will you insert?");
                int index= scan.nextInt();
                System.out.println("What number do you want to insert?");
                int insert=scan.nextInt();
                if(list.size()<=index){//if given index >=list size just add end of the list
                    list.add(insert);
                }else{///if given index <list size -> add//insert to given index
                   list.add(index,insert);
                }
            }
            if(operator.equals("delete")){
                System.out.println("which index will you delete?");
                int index= scan.nextInt();
                list.remove(index);//it will remove given index

            }
        }

        System.out.println(list);
    }
}
/*

 */