import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardPayment implements Wallet {

    protected ArrayList<String> cards;
    private String pickedCard;

    public CardPayment() {
        this.cards = new ArrayList<>();
    }

    @Override
    public List<Card> listcards() {

        for (int i = 0; i < this.cards.size(); i++) {
            System.out.println(this.cards.get(i));

        }

        return null;
    }

    @Override
    public void applyCard() {
        this.listcards();
        Scanner myObj = new Scanner(System.in);
        int cardIndex;
        do {
            cardIndex = myObj.nextInt();
            if (cardIndex > this.cards.size()) {
                System.out.println("Incorrect payment type, please select another one");

            } else {
                this.pickedCard = this.cards.get(cardIndex);
                System.out.println(pickedCard);
            }
        } while (cardIndex >= this.cards.size());
    }

}

