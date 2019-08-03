
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        String name = "placeholder";
        while (true){
            System.out.print("Name: ");
            name = reader.nextLine();
            if (!(name.equals(""))){
                System.out.print("Student number: ");
                String studentNum = reader.nextLine();
                list.add(new Student(name, studentNum));
            } else {
                break;
            }     
        }
        for (Student i : list){
            System.out.println(i);
        }
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        System.out.println("Result: ");
        for (Student i : list){
            if (i.getName().contains(searchTerm)){
                System.out.println(i);
            }
        }

    } 
    
}
  