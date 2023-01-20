package tasks;

import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        // to get names and numbers
        Scanner scan=new Scanner(System.in);//I want get them as I wanted //so create loop
int last=scan.nextInt();
        Map<String,Long> phonebook = new java.util.HashMap<>();
        for(int i = 0; i < last; i++){
            String name = scan.nextLine();// to get names=> keys for map
         //  scan.nextLine();
            long phoneNumber = scan.nextLong();// to get numbers => values for map
          //  scan.nextLine();
            phonebook.put(name,phoneNumber);
        }
    //    scan.nextLine();
        System.out.println(phonebook);
        // if phonebook contains same name which is given from keybord// and it will continiue so while loop
        while(true){
            String name1=scan.nextLine();
            if(phonebook.containsKey(name1)){
                System.out.println(name1  + "=" +phonebook.get(name1));
            }else{
                System.out.println("Not found");
            }
        }



    }
}
/*
 while(scan.hasNext())
        {
            String name = scan.next();  // to enter key to fetch a specific value
            if(phonebook.containsKey(name)== true)
            {
                System.out.println(name  + "=" +phonebook.get(name));

            }else
            {
                System.out.println("Not found");
            }

        }
 */