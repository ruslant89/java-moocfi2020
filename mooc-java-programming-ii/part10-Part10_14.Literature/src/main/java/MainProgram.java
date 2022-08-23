
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Input the name of the book, empty stops: ");
            String book = scanner.nextLine();

            if (book.isEmpty()) {
                break;
            }

            System.out.print("Input the age recommendation: ");
            String ageStr = scanner.nextLine();
            int age = Integer.parseInt(ageStr);

            books.add(new Book(book, age));
            System.out.println();

        }

        System.out.println();
        System.out.println(books.size() + " books in total.\n");
        System.out.println("Books:");

        Comparator<Book> comparator = Comparator.comparing(Book::getAge).thenComparing(Book::getName);
        Collections.sort(books, comparator);

        books.stream().forEach(book -> System.out.println(book));
    }

}
