import java.util.ArrayList;

public class Hideout<T> {

    private ArrayList<T> values;

    public Hideout() {
        this.values = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        this.values.add(toHide);
    }

    public T takeFromHideout() {
        int size = this.values.size();
        T val = this.values.get(size - 1);
        this.values.remove(size - 1);

        return val;
    }

    public boolean isInHideout() {
        return !this.values.isEmpty();
    }
}
