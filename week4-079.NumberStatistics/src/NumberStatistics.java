
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;

    public NumberStatistics() {
        this.amountOfNumbers = 0;
        this.sum = 0;
    }

    public void addNumber(int number) {
        amountOfNumbers++;
        sum += number;
        
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }
    
    public int sum(){
        if (amountOfNumbers > 0){
             return this.sum;
        } else{
            return 0;
        }
    }
    
    public double average(){
        double average = 0.0;
        if (amountOfNumbers > 0){
            return (double)sum/amountOfNumbers;
        } else {
            return 0;
        }
        
    }
}
    
