public class Clock {
    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;
   
    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
        // the counters that represent hours, minutes and seconds are created and set to have the correct initial values
        this.hours = new BoundedCounter(hoursAtBeginning);
        this.minutes = new BoundedCounter(minutesAtBeginning);
        this.seconds = new BoundedCounter(secondsAtBeginning);
        this.hours = new BoundedCounter(24);
        this.minutes = new BoundedCounter(60);
        this.seconds = new BoundedCounter(60);
        
        this.hours.setValue(hoursAtBeginning);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds.setValue(secondsAtBeginning); 
    }
    
    public void tick() {
        if(seconds.getValue() == 59){    
            if(minutes.getValue() == 59) {
                if(hours.getValue() == 23){
                    hours.setValue(0);
                    minutes.setValue(0);
                    seconds.setValue(0);
                } else {
                    hours.next();
                }
            }
             
         } else {
             seconds.next();
         }
        
    }
    
    public String toString() {
        // returns the string representation
        return hours + ":" + minutes + ":" + seconds;
    }
}
