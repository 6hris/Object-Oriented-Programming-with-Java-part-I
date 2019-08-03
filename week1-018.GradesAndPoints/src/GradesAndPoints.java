
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int grade = Integer.parseInt(reader.nextLine());
        if (grade <= 29) {
            System.out.println("grade: failed");
        } else if (grade <=34) {
            System.out.println("grade: 1");
        } else if (grade <= 39) {
            System.out.println("grade: 2");
        } else if (grade <= 44) {
            System.out.println("grade: 3");
        } else if (grade <= 49) {
            System.out.println("grade: 4");
        } else if (grade <= 60) {
            System.out.println("grade: 5");
        } 
    }
}
