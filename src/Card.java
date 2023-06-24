public class Card {
    private String cardNumber;
    private String holderName;
    private int cvc;
    private String date;

    public Card(String cardNumber, String holderName, int cvc, String date) {
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.cvc = cvc;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardNumber: " + cardNumber + '\'' +
                ", holderName: " + holderName +
                ", cvc: " + cvc +
                ", date: " + date + '\'' +
                '}';
    }
}
