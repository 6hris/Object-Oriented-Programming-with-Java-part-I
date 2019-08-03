
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int unum = Integer.parseInt(reader.nextLine());
        int count = 0;
        int sum= 0;
        while (count <= unum) {
            sum = sum + (int)Math.pow(2,count);
            count++;            
        }
        System.out.println(sum);

    }
}
