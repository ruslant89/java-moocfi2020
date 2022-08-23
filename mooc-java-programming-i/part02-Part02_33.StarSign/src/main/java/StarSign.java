
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(5);
        System.out.println("---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("---");
        printRectangle(17, 3);
        System.out.println("---");
        printTriangle(4);
        System.out.println("---");
    }

    public static void printStars(int number) {
        int count = 1;
        while (count <= number) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        int number = 1;

        while (number <= size) {
            printStars(size);
            number++;
        }
    }

    public static void printRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printTriangle(int size) {
        int start = 1;
        while (start <= size) {
            printStars(start);
            start++;
        }
    }
}
