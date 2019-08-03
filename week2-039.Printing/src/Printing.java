public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times  
        int count = 0;
        while (count < amount){
          System.out.print("*");
          count++;  
        }
        System.out.println("");
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int count = 0;
        while (count < sideSize) {
            printStars(sideSize);
            
            count++;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        int countW = 0;
        int countH = 0;
        int tW = width;
        int tH = height;
        while(countH != tH){
            printStars(tW);
            countH++;
        }
        
        
    }

    public static void printTriangle(int size) {
        // 39.4
        int starSize = 1;
        int count = 0;
        while (count < size) {
            printStars(starSize);
            starSize++;
            count++;
            

        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 4);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
