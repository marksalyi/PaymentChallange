import java.util.ArrayList;
import java.util.List;

public class Xiaomi8 extends Android implements Wallet, NFC{
    private ArrayList<String> availableCards;

    public Xiaomi8() {
        this.availableCards = new ArrayList<>();
        availableCards.add("visa");
        availableCards.add("googlePay");
        availableCards.add("applePay");
        availableCards.add("bankTransfer");
    }

    @Override
    public boolean isMobilePaymentAllowed() {
        return false;
    }

    @Override
    public List<Card> listcards() {
        if(isMobilePaymentAllowed()){
            for(int i = 0; i < this.availableCards.size(); i++) {
                System.out.println(this.availableCards.get(i));
            }
        }
        System.out.println("Mobile payment not allowed on your phone");
        return null;
    }

    @Override
    public Card applyCard() {
        if(isMobilePaymentAllowed()) {
            return new Card("1111-2222-3333-4444", "Salyi Mark", 250, "05/25");
        }
        return null;
    }
}
