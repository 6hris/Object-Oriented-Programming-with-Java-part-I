import java.util.Scanner;

public class GuessingGame {

    private Scanner reader;

    public GuessingGame() {
        // use only this scanner, othervise the tests do not work
        this.reader = new Scanner(System.in);
    }

    public void play(int lowerLimit, int upperLimit) {
        instructions(lowerLimit, upperLimit);

        // write the guessing logic here
        int average;
        Boolean greaterThan;
        while (true){
            if (lowerLimit == upperLimit){
                System.out.println("The number you're thinking of is " + upperLimit + ".");
                break;
            }
            
            average = average(lowerLimit, upperLimit);
            greaterThan = isGreaterThan(average);
            
            if (greaterThan){
                lowerLimit = average+1;
               
            } else{
                upperLimit = average;
            }
        }
        

    }

    // implement here the methods isGreaterThan and average
    
    public boolean isGreaterThan(int number){
        System.out.println("Is your number greater than " + number + "? (y/n)");
        String val = reader.nextLine();
        if (val.equals("y")){
            return true;
        } else {
            return false;
        }
    }
    
    public int average(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;
        int average = sum/2;
        return average;
    }

    public void instructions(int lowerLimit, int upperLimit) {
        int maxQuestions = howManyTimesHalvable(upperLimit - lowerLimit);

        System.out.println("Think of a number between " + lowerLimit + "..." + upperLimit + ".");

        System.out.println("I promise you that I can guess the number you are thinking with " + maxQuestions + " questions.");
        System.out.println("");
        System.out.println("Next I'll present you a series of questions. Answer them honestly.");
        System.out.println("");
    }

    // a helper method:
    public static int howManyTimesHalvable(int number) {
        // we create a base two logarithm  of the given value

        // Below we swap the base number to base two logarithms!
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
}
