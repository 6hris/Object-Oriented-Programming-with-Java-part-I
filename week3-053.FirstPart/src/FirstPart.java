
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of first part: ");
        int length = Integer.parseInt(reader.nextLine());
        String firstPart = word.substring(0,length);
        System.out.println("Result: "+ firstPart);
    }
}
