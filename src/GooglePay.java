import java.util.ArrayList;

public class GooglePay implements Payment{
    private ArrayList<String> cards;

    public GooglePay() {
        this.cards = new ArrayList<>();
        cards.add("visa");
        cards.add("revolut");
        cards.add("debitcard");
        cards.add("creditcard");
    }

    @Override
    public void pay() {
        for(int i = 0; i < cards.size(); i++){
            System.out.println("you can choose: " + cards.get(i));
        }
    }
}
