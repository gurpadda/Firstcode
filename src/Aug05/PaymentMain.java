package Aug05;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.Validate();
        payment.processPayment();
        Payment payment1 = new PaypalPayment();
        payment1.Validate();
        payment1.processPayment();
        Payment payment2 = new DebitcardPayment();
        payment2.Validate();
        payment2.processPayment();

    }
}

