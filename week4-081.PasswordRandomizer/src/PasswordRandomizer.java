import java.util.ArrayList;
import java.util.Random;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int passLength;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.passLength = length;
    }

    public String createPassword() {
        // write code that returns a randomized password
        int count = 0;
        String password = "";
        while (count < passLength){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26));
            password += symbol;
            count++;

        }
            
        
        return password;
    }
}
