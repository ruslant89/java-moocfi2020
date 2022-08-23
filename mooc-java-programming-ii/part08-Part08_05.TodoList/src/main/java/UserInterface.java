import java.util.Scanner;

public class UserInterface {

    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if ("stop".equals(command)) {
                break;
            }

            if ("add".equals(command)) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                todoList.add(task);
            }

            if ("list".equals(command)) {
                todoList.print();
            }

            if ("remove".equals(command)) {
                System.out.print("Which one is removed? ");
                int taskNum = Integer.parseInt(scanner.nextLine());
                this.todoList.remove(taskNum);
            }
        }
    }
}
