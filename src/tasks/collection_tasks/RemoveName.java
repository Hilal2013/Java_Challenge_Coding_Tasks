package tasks.collection_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveName {
    public static void main(String[] args) {
List<String> list=new ArrayList<>();
list.addAll(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        System.out.println(removeNames(list));//[John, Eric]
    }

public static List<String> removeNames(List<String> list){
    Iterator<String> it=list.iterator();
    while(it.hasNext()) {
        if (it.next().equals("Ahmed")) {
            it.remove();
        }
    }
        return list;
    //solution two
    /*
public static List<String> remove2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }
    //solution three
public static List<String> remove3(List<String> names){
 names.removeIf(name -> name.equals("Ahmed"));
        return names;
}

     */


}

}
  /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */