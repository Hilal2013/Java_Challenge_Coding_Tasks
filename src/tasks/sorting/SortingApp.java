package tasks.sorting;

import java.util.*;
import java.util.stream.Collectors;

public class SortingApp {

    /*    1- Arrays.sort() || Collections.sort()
          2- Stream sorted() method
          3- List interface .sort() method
    */
    public static void main(String[] args) {

        Integer[] numsAsArr = {10, 46, 24, 20, 2, 56};
        Arrays.sort(numsAsArr);//ascending//allows us array  sort out
        System.out.println(Arrays.asList(numsAsArr));//[2, 10, 20, 24, 46, 56]

        List<Integer> numsAsList = new ArrayList<>(Arrays.asList(10, 46, 24, 20, 2, 56));

        Collections.sort(numsAsList);
        System.out.println(numsAsList);//[2, 10, 20, 24, 46, 56]

        List<Student> studentList = studentGenerator();
// in which condition will sort there is id name
        //implement Comparable interface
        Collections.sort(studentList);
        System.out.println(studentList);
//[Student{id=2, firstName='Alan', lastName='Morris'}, Student{id=3, firstName='Kevin', lastName='Watts'},..
        List<Student> studentList1 = studentGenerator();
        List<Student> studentList2=studentList1.stream().sorted().collect(Collectors.toList());

        System.out.println(studentList2);
        studentList1.sort((o1,o2)->o1.id>o2.id ?1:(o1.id<o2.id ? -1 : 0));
        System.out.println(studentList1);
        studentList1.sort(Comparator.comparing(Student::toString));
        System.out.println(studentList1);
        studentList1.sort(Comparator.comparing(Student::getFirstName).thenComparing(Student::getId));
        System.out.println(studentList1);

    }
    public static List<Student> studentGenerator() {

        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student(5, "Joe", "Doe"));
        studentList.add(new Student(3, "Kevin", "Watts"));
        studentList.add(new Student(4, "Micheal", "Gibson"));
        studentList.add(new Student(2, "Alan", "Morris"));

        return studentList;
    }

}
