import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    Random random = new Random();

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int count = 0;
        int password = 0;
        while (count < 7){
            password = this.random.nextInt(39)+1;
            if (!containsNumber(password)){
                numbers.add(password);
                count++;
            }
        }
    }

    public boolean containsNumber(int password) {
        if (numbers.contains(password)){
           return true; 
        }else{
            return false;
        }
        
    }
}
