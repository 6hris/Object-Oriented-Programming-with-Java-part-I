
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        // program your solution here. Do not touch the above lines!
        int uguess= 0;
        int numGuess = 0;
        while (true) {
            System.out.println("Guess a number: ");
            uguess = Integer.parseInt(reader.nextLine());
            numGuess++;
            if (uguess == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
                break;
            } else if (uguess > numberDrawn){
                System.out.println("The number is lesser, guesses made: " + numGuess);
            } else if (uguess < numberDrawn) {
                System.out.println("The number is greater, guesses made: " + numGuess);
            }
        }
        
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
