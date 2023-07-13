import java.sql.SQLOutput;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    static String paymentType = "google";
    public static Payment selectPayment(String paymentType){
        if(paymentType == "visa"){
            return new Visa("1111-2222-3333-4444", "Sályi Márk",659,"05/25");
        } else if (paymentType == "google") {
            return new GooglePay();

        }else if (paymentType == "apple"){
            return new ApplePay();
        }
        return new BankTransfer();
    }

    static Payment actualPayment = selectPayment(paymentType);




    public static void main(String[] args) {

        Wallet iphone12Wallet = new Iphone12();
        iphone12Wallet.listcards();
        // imessage nincs rajta mert Wallet a típusa

        System.out.println("=============================");

        Iphone8 iphone8 = new Iphone8();
        iphone8.call();
        iphone8.sendmessage();
        iphone8.imessage();

        Xiaomi8 xiaomi8 = new Xiaomi8();
        xiaomi8.call();
        xiaomi8.sendmessage();

        Xiaomi12 xiaomi12 = new Xiaomi12();
        xiaomi12.listcards();
        xiaomi12.applyCard();

        /*
        MobileInterface i = new Iphone12();
        i.call();
        i.senbdÍMessage();

        IMessage iphone = new Iphone12();
        iphone.imessage();

        IMessage iphone8 = new Iphone8();
        iphone8.imessage();

        Iphone8 iphone8 = new Iphone8();
        */
       // System.out.println(actualPayment);








    }
}