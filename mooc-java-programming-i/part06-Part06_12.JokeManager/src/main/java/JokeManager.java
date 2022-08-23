import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public String drawJoke() {
        String response = "Jokes are in short supply.";
        if (this.jokes.isEmpty()) {
            System.out.println(response);
        } else {
            Random rand = new Random();
            int index = rand.nextInt(this.jokes.size());
            response = this.jokes.get(index);
        }
        return response;
    }

    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
