import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        this.tasks = new ArrayList<>();
    }

    public void add(String task) {
        this.tasks.add(task);
    }

    public void print() {
        for (int i = 0; i < this.tasks.size(); i++) {
            int count = i + 1;
            System.out.println(count + ": " + this.tasks.get(i));
        }
    }

    public void remove(int number) {
        // we know number matches number of tasks
//        if (number == this.tasks.size()) {
//            // check that only 1 item in list then remove it
//            if (this.tasks.size() == 1) {
//                this.tasks.remove(0);
//            } else {
//                this.tasks.remove(number + 1);
//            }
//        } else {
//            this.tasks.remove(number - 1);
//        }

        int offsetNumber = 0;

        if (number == this.tasks.size()) {
            // check that only 1 item in list then remove it
            if (this.tasks.size() == 1) {
                offsetNumber = 0;
            } else {
                offsetNumber = number + 1;
            }
        } else {
            offsetNumber = number - 1;
        }

        this.tasks.remove(offsetNumber);
    }
}
