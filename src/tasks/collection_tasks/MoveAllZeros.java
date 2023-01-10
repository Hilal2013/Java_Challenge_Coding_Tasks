package tasks.collection_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveAllZeros {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,0,3,0,5,6,0,7));
        System.out.println(moveZerosEnd(list));//[1, 3, 5, 6, 7, 0, 0, 0]

    }
    public static List<Integer> moveZerosEnd(List<Integer> list){
        int beginSize=list.size();//8
        list.removeAll(Arrays.asList(0));
        int newSize= list.size();//5
        int totalNumberOfSize=beginSize-newSize;
        for (int i = newSize; i < beginSize; i++) {
            list.add(0);
        }
      /*
      for (int i = 0; i < totalNumberOfSize; i++) {
            list.add(0);
        }
       */

        return list;
    }
//solution two
    /*
    int[] arr1={10, 0, 5, 0, 1, 0};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));//[0, 0, 0, 1, 5, 10]now reverse
        int [] zeroEnd= new int[arr1.length];
        for (int i = arr1.length - 1,j=0; i >= 0; i--,j++) {
            zeroEnd[j]=arr1[i];
        }
        System.out.println(Arrays.toString(zeroEnd));
        //solution three
        int[] array = {10, 0, 5, 0, 1, 0};

        int[] result = new int[array.length];
        int j = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0 ) {
                result[j++] = array[i];
            }

        }

        System.out.println(Arrays.toString(result));

     */

}
 /*
    write a program that can move all the zeros to the end of the List of integers
     */