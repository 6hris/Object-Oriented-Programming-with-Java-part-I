import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int nameLength = name.length();
        int count = 0;
        int count2 = (nameLength-1);
        System.out.print("in reverse order: " );
        while (count < nameLength){
            System.out.print(name.charAt(count2));
            count++;
            count2--;
        }
        
    }
}
