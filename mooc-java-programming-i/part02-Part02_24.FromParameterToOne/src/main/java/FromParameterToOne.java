

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number) {
        int end = 1;

        for (int i = number; i >= end; i--) {
            System.out.println(i);
        }
    }

}
