package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class InsertandDeleteList {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int list1=scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
       list.add(list1);
       int index= scan.nextInt();
        String op=scan.next();
        if(op.equals("insert")){
            if(list.size()<=index){
                list.add(index);
            }
        }


    }
}
/*
if (op.equals("add")) {
            if (list.size() <= (Integer.parseInt(id))) {
                list.add(id + data);
            } else {
                for (int i = 0; i < list.size(); i++) {
                    if ((list.get(i).substring(0, 1)).equals(id)) {
                        list.add(Integer.parseInt(id) - 1, id + data);
                        break;
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                list.set(i, list.get(i).substring(1));
            }
            for (int i = 0, j = 1; i < list.size(); i++, j++) {
                if (i == 0) {
                    result += j + "" + list.get(i);
                } else {
                    result += "#" + j + list.get(i);
                }
            }
            return result;
        }

        if (op.equals("edit")) {
            list.set(Integer.parseInt(id)-1, id + data);
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    result += list.get(i);
                } else {
                    result += "#" + list.get(i);
                }

            }
            return result;
        }

        if (op.equals("delete")) {
            for (String each : list) {
                if (("" + each.charAt(0)).equals(id)) {
                    list.remove((Integer.parseInt(id)) - 1);
                    break;
                }
            }
        }
        if ((Integer.parseInt(id)) == 1) {
            for (int i = 0; i < list.size(); i++) {

                result += "#" + list.get(i);
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (i == 0) {
                    result += list.get(i);
                } else {
                    result += "#" + list.get(i);
                }
            }

        }

        return result;


 */