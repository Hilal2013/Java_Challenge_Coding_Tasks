package tasks.collection_tasks;

import java.util.*;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        frequencyOfCharacter( "apple");


    }
    public static void frequencyOfCharacter(String str){
        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        String[] arr=str.split("");
        for (String each : arr) {
            int frequency= Collections.frequency(Arrays.asList(arr),each);
            map.put(each,frequency);
        }
        System.out.println(map);//{a=1, p=2, l=1, e=1}
        String result="";
        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            result+=eachPair.getKey()+eachPair.getValue();
        }
        System.out.println(result); //a1p2l1e1

/*
Map<Character,Integer> map=new LinkedHashMap<>();
        for (Character each : str.toCharArray()) {
           // map.put(each, Collections.frequency(Arrays.asList(str.toCharArray()),each));

            if(map.containsKey(each)){
                map.put(each,map.get(each)+1); // if map contains the character, I will increase it's value by one
            }else {
                map.put(each,1);// if not then I will add that key with a value 1 to the map
            }
        }
        System.out.println(map);

 */

    }

}
/*
 * Create a method that will accept a String and print out the frequency of every character in the String

Hint: use maps to keep track of the frequency. Go through the String using only one loop

Ex:
    Input: "apple"
    Output: Key "a" = Value "1"
    Map < Character , Integer >
            p = 2
            l = 1
            e = 1
    // I want to keep insertion order
        Map<Character,Integer> frequencyMap = new LinkedHashMap<>();
        for(Character each : str.toCharArray()){  // loop through string by turning it into an array
            // if frequencyMap contains the character, I will increase it's value by one, if not then I will add that key with a value 1 to the map
            if(frequencyMap.containsKey(each)){
                frequencyMap.put(each,frequencyMap.get(each)+1); // if frequencyMap contains the character, I will increase it's value by one
            }else {
                frequencyMap.put(each,1);// if not then I will add that key with a value 1 to the map
            }

            System.out.println("frequencyMap = " + frequencyMap);
        }
      String[] str = word.split("");

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < word.length(); i++) {

            map.put(word.charAt(i), Collections.frequency(List.of(str),str[i]));
        }

        System.out.println(map); // {a=1, p=2, l=1, e=1}

 */