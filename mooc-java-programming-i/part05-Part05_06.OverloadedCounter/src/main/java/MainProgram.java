
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        Counter counter = new Counter();
        Counter counter2 = new Counter(6);

        counter.increase();
        counter.increase(7);
        System.out.println(counter);

        counter.decrease();
        counter.decrease(4);
        System.out.println(counter);

        counter.increase(10);
        System.out.println(counter);

        counter.increase(-20);
        System.out.println(counter);

        System.out.println(counter2);
    }
}
