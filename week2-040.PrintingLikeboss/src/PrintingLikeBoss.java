public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    
    public static void printStars(int amount) {
        int count = 0;
        while (count < amount){
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int count = 0;
        while (count < amount){
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int space = size;
        int count = 0;
        int stars = 1;
        while (count < size){
            space = space - 1;
            printWhitespaces(space);
            printStars(stars);
            stars++;
            count++;
            
        }
            
    }

    public static void xmasTree(int height) {
        int tree = 5;
        int count = 2;
        int spaces = 7;
        int numSpace = height - 1;
        printWhitespaces(numSpace);
        System.out.println("*");
        numSpace = numSpace -1;
        printWhitespaces(numSpace);
        System.out.println("***");
        while (count < height) {
            numSpace = numSpace -1;
            printWhitespaces(numSpace);
            printStars(tree);
            spaces = spaces - 1;
            tree = tree + 2;
            count++;
        }
        printWhitespaces((height - 2));
        System.out.println("***");
        printWhitespaces((height - 2));
        System.out.println("***");
        
        // 40.3
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
