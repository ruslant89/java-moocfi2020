
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(6);
        numbers.add(1);
        numbers.add(66);
        numbers.add(-3);
        numbers.add(-77);
        numbers.add(8);
        numbers.add(9);

        System.out.println(positive(numbers));
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(value -> value > 0).collect(Collectors.toList());
    }
}
