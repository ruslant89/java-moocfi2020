
public class AdvancedAstrology {

    public static void printStars(int number) {
        int starsCount = 1;

        while (starsCount <= number) {
            System.out.print("*");
            starsCount++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int count = 1;
        while (count <= number) {
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        int count = 1;
        int spaces = size - 1;

        while (count <= size) {
            printSpaces(spaces);
            printStars(count);
            spaces--;
            count++;
        }
    }

    public static void christmasTree(int height) {

        int stars = 1;
        int loop = 1;
        int spaces = height - 1;
        int baseHeight = 2;
        int baseWidth = 3;

        while (loop <= height) {
            printSpaces(spaces);
            printStars(stars);
            stars += 2;
            spaces--;
            loop++;
        }

        int baseOffset = height - 2;
        for (int i = 1; i <= baseHeight; i++) {
            printSpaces(baseOffset);
            printStars(baseWidth);
        }

    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        System.out.println("---");
        christmasTree(13);
    }
}
