
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        MyList<String> myList = new MyList<>();
        myList.add("hello");
        myList.add("world");

        for(int i = 0; i < myList.size(); i++) {
            System.out.println(myList.value(i));
        }

    }

}
