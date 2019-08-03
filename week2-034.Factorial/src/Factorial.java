import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int unum = Integer.parseInt(reader.nextLine());
        int count = 1;
        int factorial = 1;
        while (count <= unum) {
            factorial *= count;
            count++;            
        }
        System.out.println(factorial);
    }
}
