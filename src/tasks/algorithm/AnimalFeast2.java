package tasks.algorithm;

public class AnimalFeast2 {

    public static void main(String[] args) {
        String animalName="great blue heron";
        String dishName="garlic naan";
        System.out.println(checkNames(animalName,dishName));

    }

    public static boolean checkNames(String animalName,String dishName){

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
        }

        for (int i = 0; i < dishName.length(); i++) {
            if(!Character.isDigit(dishName.charAt(i))){
                hasDigitDish=true;
            }

        }
        return firstAndLastLetters && nameLength && hasSpace_HyphenAnimal && hasSpace_HyphenDish
                &&hasDigitAnimal && hasDigitDish;
    }

}
