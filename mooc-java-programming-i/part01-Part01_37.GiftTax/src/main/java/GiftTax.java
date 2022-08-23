
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double payableTax = 0;

        if (value >= 5000 && value <= 25000) {
            payableTax = 100 + (value - 5000) * 0.08;
            System.out.println("Tax: " + payableTax);
        } else if (value >= 25000 && value <= 55000) {
            payableTax = 1700 + (value - 25000) * 0.10;
            System.out.println("Tax: " + payableTax);
        } else if (value >= 55000 && value <= 200000) {
            payableTax = 4700 + (value - 55000) * 0.12;
            System.out.println("Tax: " + payableTax);
        } else if (value >= 200000 && value <= 1000000) {
            payableTax = 22100 + (value - 200000) * 0.15;
            System.out.println("Tax: " + payableTax);
        } else if (value >= 1000000) {
            payableTax = 142100 + (value - 1000000) * 0.17;
            System.out.println("Tax: " + payableTax);
        } else {
            System.out.println("No tax!");
        }
    }
}
