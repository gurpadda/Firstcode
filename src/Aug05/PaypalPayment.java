package Aug05;

public class PaypalPayment extends Payment{
    @Override
    public void Validate() {
        System.out.println("payment validate for Paypal");
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("payment done for Paypal" );
    }
}
