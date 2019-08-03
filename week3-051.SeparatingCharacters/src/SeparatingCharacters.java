
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int nameLength = name.length();
        int count = 0;
        int numCount = 1;
        while (count < nameLength) {
            System.out.println(numCount + ". character: " + name.charAt(count));
            count++;
            numCount++;
        }
    }
}
