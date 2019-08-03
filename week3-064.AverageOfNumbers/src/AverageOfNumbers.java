
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int test = 0;
        for (int i : list){
            test = test + i;
        }
        return(test);
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        double bum = 0.0;
        for (int num : list){
            bum++;
        }
        double sum = (sum(list)/bum);
        return (sum);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}
