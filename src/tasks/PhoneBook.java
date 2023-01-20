package tasks;

import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        // to get names and numbers
        Scanner scan = new Scanner(System.in);//I want get them as I wanted //so create loop
        int last = scan.nextInt();
        Map<String, Long> phoneBook = new java.util.HashMap<>();
        for (int i = 0; i < last; i++) {
            scan.nextLine();
            String name = scan.nextLine();// to get names=> keys for map
            long phoneNumber = scan.nextLong();// to get numbers => values for map
            if ((phoneNumber + "").length() == 8 && !(phoneNumber + "").substring(0, 1).equals("0")) {
                phoneBook.put(name.toLowerCase(), phoneNumber);
            } else {
                System.out.println("Your phone number is not valid");

            }

        }
            System.out.println(phoneBook);
            scan.nextLine();
            while (true) {//it will continue so we will use while loop
                String name1 = scan.nextLine();
                if (phoneBook.containsKey(name1)) {// if phonebook contains same name which is given from keybord
                    System.out.println(name1 + "=" + phoneBook.get(name1));
                } else {
                    System.out.println("Not found");
                }
            }

//scan.close();?

        }

}
/*
scan.nextLine;
if we have another scanner method(next(),nextInt,nextLong)..) except nexLine()
  we have to give extra nextLine to clean the scanner memory
             before the nextLine()
 */