
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();

        // Implement the random number generation here
        // the method containsNumber is probably useful
        Random random = new Random();
        int lottoNumber = 1;

        for (int i = 0; i < 6; i++) {
            lottoNumber = random.nextInt(40) + 1;
            for (int j = 0; j < i; j++) {
                if (containsNumber(lottoNumber)) {
                    lottoNumber = random.nextInt(40) + 1;
                    j = -1; // restart loop
                }
            }
            this.numbers.add(lottoNumber);
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return this.numbers.contains(number);
    }
}

