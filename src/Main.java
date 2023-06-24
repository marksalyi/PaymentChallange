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


       // actualPayment.pay();

        Iphone12 iphoneTwelve = new Iphone12();
        iphoneTwelve.isMobilePaymentAllowed();
        iphoneTwelve.listcards();
        iphoneTwelve.applyCard();
        System.out.println(iphoneTwelve.applyCard());

        System.out.println("=============================");

        Iphone8 iphoneEight = new Iphone8();
        iphoneEight.isMobilePaymentAllowed();
        iphoneEight.listcards();
        iphoneEight.applyCard();

        System.out.println("=============================");

        Xiaomi12 xiaomiTwelve = new Xiaomi12();
        xiaomiTwelve.isMobilePaymentAllowed();
        xiaomiTwelve.listcards();
        xiaomiTwelve.applyCard();

        System.out.println("=============================");

        Xiaomi8 xiaomiEight = new Xiaomi8();
        xiaomiEight.isMobilePaymentAllowed();
        xiaomiEight.listcards();
        xiaomiEight.applyCard();
    }
}