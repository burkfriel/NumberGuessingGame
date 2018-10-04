import java.util.Scanner;

public class NumberGuessingGame {

    public static void main (String[]args){

        Scanner keyboard;
        int pickedNumber;
        int guessedNumber;
        boolean youGotIt;
        int numberOfGuesses;
        boolean playAgain;
        int playAgainn;

        playAgain = false;
        keyboard = new Scanner(System.in);


        while (!playAgain) {

            System.out.println("Hello this is a number guessing game.");
            System.out.println("The rules are really simple.");
            System.out.println("*Guess a number if it is too high it will say too high guess again.");
            System.out.println("*Guess a number if it is too low it will say too low guess again.");

            youGotIt = false;
            pickedNumber = (int) (Math.random() * 100);
            numberOfGuesses = 7;

            while (!youGotIt && numberOfGuesses > 0) {

                System.out.println("So guess a number.");
                guessedNumber = keyboard.nextInt();

                if (guessedNumber < pickedNumber) {
                    System.out.println("Your Number is too low try again.");

                } else if (guessedNumber > pickedNumber) {
                    System.out.println("Your Number is too high try again.");

                } else if (guessedNumber == pickedNumber) {
                    System.out.println("You got it right.");
                    youGotIt = true;
                }

                numberOfGuesses--;





            }




            if (youGotIt==true){
                System.out.println("Thank you for playing");
                System.out.println("You had "+numberOfGuesses+" guesses left");
            }
            else if (youGotIt==false&&numberOfGuesses<1){
                System.out.println("You did not guess the number.");
                System.out.println("The number you were trying to guess was "+pickedNumber+".");
            }
            System.out.println("Would you like to play again 1=Yes 2=No.");
            playAgainn = keyboard.nextInt();

            if (playAgainn == 2){
                System.out.println("Thank you for playing my number guessing game.");
                playAgain = true;
            }
            if (playAgainn == 1){
                playAgain = false;
            }

        }


    }


}
