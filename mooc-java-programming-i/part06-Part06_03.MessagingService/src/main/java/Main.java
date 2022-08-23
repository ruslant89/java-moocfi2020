
public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message msg1 = new Message("Sender1", "You should not go to the meeting tonigh its a set up");
        Message msg2 = new Message("Sender2", "Copy that.");

        Message msgLong = new Message("IDontCare", "this is a really long message that is hopefully over 280 characters but if not i can still write all kinds of nonsense here to fill all this space up and eat up all the characters so that 1s and 0s in bits are over the specified lenght thus i can make sure that the program works as expected");

        MessagingService service = new MessagingService();

        service.add(msg1);
        service.add(msg2);
        service.add(msgLong);

        System.out.println(service.getMessages());
    }
}
