package Aug05;

public class PaymentMain {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.Validate();
        payment.processPayment(10.88);
        Payment payment1 = new PaypalPayment();
        payment1.Validate();
        payment1.processPayment(89.89);
        Payment payment2 = new DebitcardPayment();
        payment2.Validate();
        payment2.processPayment(87.34);

    }
}

