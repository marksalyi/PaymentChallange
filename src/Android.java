public class Android implements MobileInterface{
    @Override
    public void sendmessage() {
        System.out.println("Sending message");
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }
}
