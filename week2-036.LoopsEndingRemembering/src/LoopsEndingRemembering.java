import java.util.Scanner;

public class LoopsEndingRemembering {
    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int unum = 0;
        int sum = unum;
        int count = 0;
        int even = 0;
        int odd = 0;
        double avg = 0;
        while (true) {
            if (unum == -1) {
                break;
            } else {
            unum = Integer.parseInt(reader.nextLine());
            sum = sum + unum;
            count++;
            if (unum%2 == 0){
                even++;
            } else {
                odd++;
            }
            }
            
            
        }
        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + (sum + 1));
        System.out.println("How many numbers: " + (count-1));
        avg = (sum+1) / (count-1.0);
        System.out.println("Average: " + avg);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + (odd -1));
    }
}
