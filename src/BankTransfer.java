public class BankTransfer implements Payment{


    @Override
    public void pay() {
        System.out.println("external service called");
    }
}
