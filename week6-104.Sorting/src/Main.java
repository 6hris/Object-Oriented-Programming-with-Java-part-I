
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    public static int smallest(int[] values){
        int smallest = values[0];
        for (int i : values){
            if (i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] values){
        int count = 0;
        for (int i : values){
            if (smallest(values) == i){
                return count;
            }
            count++;
        }
        return -1;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] values, int index){
        int count = index;
        int smallest = values[index];
        for (int i = index; i < values.length; i++){
            if (smallest > values[i]){
                smallest = values[i];
                count = i;
            }
            
        }
        return count;
    }
    
    public static void swap(int[] values, int index1, int index2){
        int firstNum = values[index1];
        int secondNum = values[index2];
        values [index1] = secondNum;
        values [index2] = firstNum;
    }
    
    public static void sort(int[] values){
        System.out.println(Arrays.toString(values));
        for(int i = 0; i < values.length; ++i){
            int index = indexOfTheSmallestStartingFrom(values, i);
            swap(values,index,i);
            System.out.println(Arrays.toString(values));
        }
        
    }
    
    

}
