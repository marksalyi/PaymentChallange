import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Iphone12 extends CardPayment {

    public Iphone12() {
        super.cards.add("visa");
        super.cards.add("googlePay");
        super.cards.add("applePay");
        super.cards.add("bankTransfer");
    }

    // osztály ami tud fizetni 3dolog kell (kártyák, listázás, kiválasztás)

}
