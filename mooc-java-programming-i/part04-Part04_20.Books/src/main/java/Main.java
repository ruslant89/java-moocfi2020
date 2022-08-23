import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner input = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            Book book = new Book();
            System.out.print("Title: ");
            String title = input.nextLine();

            if (title.isEmpty()) {
                break;
            }

            System.out.print("Pages: ");
            int pages = Integer.valueOf(input.nextLine());

            System.out.print("Publication year: ");
            int year = Integer.valueOf(input.nextLine());

            book.setTitle(title);
            book.setPages(pages);
            book.setPublicationYear(year);

            books.add(book);
        }

        System.out.println("");
        System.out.print("What information will be printed? ");
        String toPrint = input.nextLine();

        if (toPrint.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        }

        if (toPrint.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
