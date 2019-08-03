
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        // Write your code here
        int num = 1;
        System.out.println("Up to what number?");
        int unum = Integer.parseInt(reader.nextLine());
        while (num <= unum) {
            System.out.println(num);
            num = num + 1;
        }
    }
}
