package tasks.algorithm;

public class AnimalFeast {
    public static void main(String[] args) {
        String animalName="great blue heron";
                String dishName="garlic naan";
        System.out.println(checkNames(animalName,dishName));

    }

   public static boolean checkNames(String animalName,String dishName){
       boolean hasLowerCaseAnimal = false;
       boolean hasLowerCaseDish = false;
  boolean firstAndLastLetters= dishName.charAt(0)==animalName.charAt(0)
          && dishName.charAt(dishName.length()-1)==animalName.charAt(animalName.length()-1);
boolean nameLength=animalName.length()>=2 && dishName.length()>=2;
boolean hasSpace_HyphenDish=dishName.charAt(0)!=' '&& dishName.charAt(0)!='_'
        && dishName.charAt(dishName.length()-1)!=' ' && dishName.charAt(dishName.length()-1)!='_';
       boolean hasSpace_HyphenAnimal=animalName.charAt(0)!=' '&& animalName.charAt(0)!='_'
               && animalName.charAt(animalName.length()-1)!=' ' && animalName.charAt(animalName.length()-1)!='_';
       boolean hasDigitAnimal=false;
       boolean hasDigitDish=false;

       for (int i = 0; i < animalName.length(); i++) {
           if(!Character.isDigit(animalName.charAt(i))){
               hasDigitAnimal=true;
           }
           if (!Character.isUpperCase(animalName.charAt(i))){
               hasLowerCaseAnimal=true;
           }
       }

       for (int i = 0; i < dishName.length(); i++) {
           if(!Character.isDigit(dishName.charAt(i))){
              hasDigitDish=true;
           }
           if (!Character.isUpperCase(dishName.charAt(i))){
               hasLowerCaseDish=true;
           }
       }
return firstAndLastLetters && nameLength && hasSpace_HyphenAnimal && hasSpace_HyphenDish
        &&hasDigitAnimal && hasDigitDish && hasLowerCaseAnimal && hasLowerCaseDish ;
   }
    public static boolean checkName2(String animal, String dish){

        return animal.charAt(0) == dish.charAt(0)
                && animal.charAt(animal.length()-1) == dish.charAt(dish.length()-1);


    }
    //second solution
    public static boolean isEligible(String animal, String dish) {
        return animal.charAt(0) == dish.charAt(0) &&
                animal.charAt(animal.length() - 1) == dish.charAt(dish.length() - 1);
    }

    public static boolean isEligible2(String animal, String dish){
        return (animal.charAt(0) +""+ animal.charAt(animal.length() - 1)) 		.equals(dish.charAt(0)+""+dish.charAt(dish.length() - 1));
    }
}
/*
All the animals are having a feast! Each animal is bringing one dish. There is just one rule: the
dish must start and end with the same letters as the animal's name. For example, the great
blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.
Write a method that takes the animal's name and dish as arguments and returns true or
false to indicate whether the beast is allowed to bring the dish to the feast.
Assume that beast and dish are always lowercase strings, and that each has at least two
letters. Beast and dish may contain hyphens and spaces, but these will not appear at the
beginning or end of the string. They will not contain numerals.
 */