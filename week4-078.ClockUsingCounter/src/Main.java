
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);

        System.out.print("seconds: ");
        int s = Integer.parseInt(reader.nextLine());// read the initial value of seconds from the user
                
        System.out.print("minutes: ");
        int m = Integer.parseInt(reader.nextLine()); //read the initial value of minutes from the user
        System.out.print("hours: ");
        int h = Integer.parseInt(reader.nextLine()); //read the initial value of hours from the user

        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);

        int i = 0;
        while ( i < 121 ) {
            System.out.println(hours + ":" + minutes + ":" + seconds);   // the current time printed
            seconds.next();
            if (seconds.getValue() == 59){
                minutes.next();

            } 
            // if minutes become zero, advance hours
            if (minutes.getValue() == 59){
                hours.next();
            }
            i++;

            
        }

    }
}