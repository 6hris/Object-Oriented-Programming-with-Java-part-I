
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> alphabetical = new ArrayList<String>();
        while (true){
            System.out.println("Type a word: ");
            String word = reader.nextLine();
            alphabetical.add(word);
            if (word.equals(""))
                break;
        }
        System.out.println("You typed the following words: ");
        Collections.sort(alphabetical);
        for (String newOrder : alphabetical){
            System.out.println(newOrder);
        }
    }
}
