import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String text = reader.nextLine();
        firstCharacter(text);
    }
    
    public static char firstCharacter(String text){
        char first = text.charAt(0);
        System.out.println("First character: " + first);
        return (first);
    }
}

