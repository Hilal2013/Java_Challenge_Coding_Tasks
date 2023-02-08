package tasks.algorithm;

public class WelcomeMember {
    public static void main(String[] args) {
        String[] arr= {"John", "Smith"};
        sayHello(arr, "Phoenix", "Arizona");
    }
    public static void sayHello(String[] arr, String city, String state) {
String result="Hello, ";
        for (int i = 0; i < arr.length; i++) {
            result+=arr[i]+" ";
        }
        System.out.println(result.trim()+"! Welcome to " + city + ", " + state + "!");


    }

}
/*
 WelcomeMember
Source: https://www.codewars.com/kata/5302d846be2a9189af0001e4
Explanation:
Create a method named sayHello.
It takes as input
a name,  {String[]}
city,  {String}
and state {String}
to welcome a person.
Note that name will be an array consisting of one or more values that should be joined together with one space between each, and the length of the name array in test cases will vary.

Example 1:
Input:
sayHello(new String[]{"John", "Smith"}, "Phoenix", "Arizona")
Output: Hello, John Smith! Welcome to Phoenix, Arizona!

Example 2:
Input:
sayHello(new String[]{"John"}, "Phoenix", "Arizona")
Output: Hello, John! Welcome to Phoenix, Arizona!

Example 3:
Input:
sayHello(new String[]{"John", “Cem”, “Smith”}, "Phoenix", "Arizona")
Output: Hello, John Cem Smith! Welcome to Phoenix, Arizona!

 */