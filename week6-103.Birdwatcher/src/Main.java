import java.util.Scanner;
public class Main {  

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Database birdDatabase = new Database();
        
        while (true){
            System.out.println("?");
            String command = reader.nextLine();
            if (command.equals("Quit")){
                break;
            } else {
                userInput(command,birdDatabase,reader);
            }
            
        }   
            
    }
    
    public static void userInput(String command, Database birdDatabase, Scanner reader){
        if (command.equals("Add")){
            birdDatabase.addBird(reader);
        } else if (command.equals("Observation")){
            birdDatabase.observation(reader);
        } else if (command.equals("Statistics")){
            birdDatabase.statistics();
        } else if (command.equals("Show")){
            birdDatabase.show(reader);
        }
    }

}
