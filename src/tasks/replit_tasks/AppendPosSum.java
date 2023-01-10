package tasks.replit_tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class AppendPosSum {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,-6,3,-8,0,4,3));

        System.out.println(appendPosSum(list));//[4, 3, 4, 3,14]

    }


    public static ArrayList<Integer> appendPosSum(ArrayList<Integer> list){

        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) { //add numbers greater than 0 to new list1
            if(list.get(i)>0){
                list1.add(list.get(i));
            }
        }
        System.out.println(list1);//[4, 3, 4, 3]
        int sum=0;
        for (int i = 0; i <list1.size() ; i++) {
            sum+=list1.get(i);
        }
        System.out.println(sum);//14
        list1.add(sum);//[4, 3, 4, 3, 14]

        return list1;
    }


}
/*
[4,-6,3,-8,0,4,3] add positives and then add sum
output=[4, 3, 4, 3, 14]

 */