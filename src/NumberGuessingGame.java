import java.util.Scanner;

public class NumberGuessingGame {

    public static void main (String[]args){

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        boolean youGotIt;

        keyboard = new Scanner(System.in);
        pickedNumber = (int)(Math.random()*100);

        System.out.println("Hello this is a number guessing game.");
        System.out.println("So guess a number.");
        guessedNumber = keyboard.nextInt();

        while(youGotIt){

            if (guessedNumber < pickedNumber){
                
            }
        }



    }


}
