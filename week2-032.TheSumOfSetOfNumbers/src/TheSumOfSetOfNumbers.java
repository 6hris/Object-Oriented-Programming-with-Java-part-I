
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        System.out.println("Until what? ");
        int usernum = Integer.parseInt(reader.nextLine());
        while (num < usernum) {
            num = num + 1;
            sum = sum + num;
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
