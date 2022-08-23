import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> herdList;

    public Herd() {
        this.herdList = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herdList.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable m : this.herdList) {
            m.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String result = "";

        for (Movable m : this.herdList) {
            result += m.toString() + "\n";
        }

        return result;
    }

}
