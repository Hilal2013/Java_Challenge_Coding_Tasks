package tasks.numbers_tasks;

public class HappyAndUnhappyNumber {
    public static void main(String[] args) {
        checkHappyOrUnhappy(23);
    }

    public static void checkHappyOrUnhappy(int number){




    }


}
/*

write a function that can identify if a number is a happy Number or unhappy number

23 is a happy number. Let’s see how.

        23 = 22 + 32 = 4 + 9 = 13 (sum of the squares of its digits)

        13 = 12 + 32 = 1 + 9 = 10 (sum of the squares of the digits)

        10 = 12 + 02 = 1 (sum of the squares of the digits)
        1, 13, 68,100,496,820,1000
 )
public static void solution(int n){

        while(n != 1 && n != 4){
            int r = 0, sum = 0;

            while(n > 0){
                r = n%10;
                sum = sum + (r*r);
                n = n/10;
            }

            n = sum;
        }

        if(n==1){
            System.out.println("Happy number");
        }else{
            System.out.println("Unhappy number");
        }

 */