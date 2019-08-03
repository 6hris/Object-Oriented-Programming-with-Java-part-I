
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the radius: ");
        int radius = Integer.parseInt(reader.nextLine());
        double circum = 2 * radius * Math.PI;
        System.out.println("Circumference of the circle: " + circum);

        // Program your solution here 
    }
}
