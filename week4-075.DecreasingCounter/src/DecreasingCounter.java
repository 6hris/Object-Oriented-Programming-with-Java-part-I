public class DecreasingCounter {
    private int value;  // instance variable that remembers the value of the counter
    private int intVal;

    public DecreasingCounter(int valueAtStart) {
        this.value = valueAtStart;
        this.intVal = valueAtStart;
    }

    public void printValue() {
        // do not touch this!
        System.out.println("value: " + this.value);
    }

    public void decrease() {
        // write here code to decrease counter value by one
        if (value > 0){
            value--;
        }
        
    }
    
    public void reset(){
        value = 0;
    }
    
    public void setInitial(){
        value = intVal;
    }

    // and here the rest of the methods
}
