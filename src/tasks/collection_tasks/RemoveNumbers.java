package tasks.collection_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveNumbers {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(110,0,300,25,95,106,90,101));
        System.out.println(removeNumbers(list));

    }
    public static List<Integer> removeNumbers(List<Integer> list){
        Iterator<Integer> it = list.iterator();

while(it.hasNext()){
    if(it.next()>100){
        it.remove();
    }
}
return list;
// solution 2
        /*
        public List<Integer> remove2(List<Integer> list){
            list.removeIf(number -> number > 100);
            return list;

         */

    }

}
