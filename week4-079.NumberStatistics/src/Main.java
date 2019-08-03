import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics all = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        int count = 0;
        System.out.println("Type numbers: ");
        while (count != -1){
            
            count = Integer.parseInt(reader.nextLine());
            
            if (count != -1){
              
                all.addNumber(count);
            }
            
            if (count%2 == 0 && count != -1){
                even.addNumber(count);
            }
            
            if (count%2 != 0 && count != -1){
                odd.addNumber(count);
            }
            
        }
        //System.out.println("Amount: " + stats.amountOfNumbers());
        System.out.println("sum: " + all.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
        //System.out.println("average: " + stats.average());
    }
}
    