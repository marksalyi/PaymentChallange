public class Visa implements Payment{
    private String cardNumber;
    private String holderName;
    private int cvc;
    private String date;

    public Visa(String cardNumber, String holderName, int cvc, String date) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.cvc = cvc;
        this.date = date;
    }



    @Override
    public void pay() {
        System.out.println("You paid with the following card number " + this.cardNumber);
        System.out.println("Holder name: " + this.holderName);
        System.out.println("CVC code: " + this.cvc);
        System.out.println("experation date: " + this.date);
    }
}
