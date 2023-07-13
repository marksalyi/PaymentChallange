public class Apple implements MobileInterface, IMessage {

    @Override
    public void call() {
        System.out.printf("Calling...");
    }

    @Override
    public void sendmessage() {
        System.out.println("Sending message");
    }

    @Override
    public void imessage() {
        System.out.println("IMessage message: ");
    }
}
