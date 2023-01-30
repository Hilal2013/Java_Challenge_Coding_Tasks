package tasks.string_tasks;

public class PassWordValidation {

    public static void main(String[] args) {
        System.out.println(passwordIsValid("AbDzk2fC$"));


    }
    public static boolean passwordIsValid(String password){

        boolean length = password.length() >= 6 && !password.contains(" ");//return true
        boolean hasUpperCase = false;//default
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChars = false;
//create charArray from string
        char[] arr=password.toCharArray();
        for (char each: arr) {// to access every each character

            if(Character.isUpperCase(each)){
                hasUpperCase = true;//reassign
            }
            if(Character.isLowerCase(each)){
                hasLowerCase = true;
            }
            if(Character.isDigit(each)){
                hasDigit = true;
            }else{
                hasSpecialChars = true;
            }

        }

        return  length && hasUpperCase && hasLowerCase && hasDigit && hasSpecialChars;

}
}
  /*
    Write a function that can verify if a password is valid or not. requirements:
                1. Password MUST be at least have 6 characters and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lowercase letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
        if all requirements above are met, the method returns true, otherwise returns false
       int countLetter = 0;
        int countDigit = 0;
        int countSpecial = 0;
        int countSpace = 0;

        for (char each : password.toCharArray()) {
            if (Character.isLetter(each)) {
                countLetter++;
            } else if (Character.isDigit(each)) {
                countDigit++;
            } else if (Character.isWhitespace(each)) {
                countSpace++;
            } else {
                countSpecial++;
            }
        }


        if (countDigit < 1 || countLetter < 1 || countSpecial < 1 || countSpace > 0) {
            isStrongPassword = false;
        }



     */