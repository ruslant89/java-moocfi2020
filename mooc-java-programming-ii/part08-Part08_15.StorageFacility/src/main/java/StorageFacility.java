import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        if (this.storage.containsKey(unit)) {
            this.storage.get(unit).add(item);
        } else {
            this.storage.put(unit, new ArrayList<>());
            this.storage.get(unit).add(item);
        }
    }

    public ArrayList<String> contents(String storageUnit) {
        if (this.storage.containsKey(storageUnit)) {
            return this.storage.get(storageUnit);
        }

        return new ArrayList<>();
    }

    public void remove(String storageUnit, String item) {
        if (this.storage.containsKey(storageUnit)) {
            ArrayList<String> items = this.storage.get(storageUnit);

            for (String i : items) {
                if (i.equals(item)) {
                    this.storage.get(storageUnit).remove(i);
                    break;
                }
            }

            if (this.storage.get(storageUnit).isEmpty()) {
                this.storage.remove(storageUnit);
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();

        for (String unit : this.storage.keySet()) {
            if (!this.storage.get(unit).isEmpty()) {
                units.add(unit);
            }
        }

        return units;
    }
}
