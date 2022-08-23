
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        Scanner scanner = new Scanner(System.in);
//        list.add("read the course material");
//        list.add("watch the latest fool us");
//        list.add("take it easy");
//
//        System.out.println();
//        list.print();
//        list.remove(2);
//
//
//        System.out.println();
//        list.print();
//
//        list.add("buy raisins");
//        System.out.println();
//        list.print();
//
//        System.out.println();
//        list.remove(1);
//        list.remove(1);
//        list.print();

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();

    }
}
