import java.util.Scanner;

public class NumberGuessingGame {

    public static void main (String[]args){

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        boolean youGotIt;

        keyboard = new Scanner(System.in);
        pickedNumber = (int)(Math.random()*100);
        youGotIt = false;

        System.out.println("Hello this is a number guessing game.");
        System.out.println("The rules are really simple.");
        System.out.println("*Guess a number if it is too high it will say too high guess again.");
        System.out.println("*Guess a number if it is too low it will say too low guess again.");
        System.out.println("So guess a number.");
        guessedNumber = keyboard.nextInt();

        while(!youGotIt){

            if (guessedNumber < pickedNumber){
                System.out.println("Your Number is too low.");

            } else if (guessedNumber > pickedNumber){
                System.out.println("Your Number is too high.");

            } else if (guessedNumber == pickedNumber){
                System.out.println("You got it right.");

                youGotIt = true;
                break;
            }

            System.out.println("Guess again.");
            guessedNumber = keyboard.nextInt();
        }

        System.out.println("Thank you for playing my number guessing game.");



    }


}
