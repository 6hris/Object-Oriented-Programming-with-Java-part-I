import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Grades classGrades = new Grades();
        System.out.println("Type exam scores, -1 completes: ");
        classGrades.getGrades(reader);
        classGrades.printGrade();
        
       
    }
}
    
    