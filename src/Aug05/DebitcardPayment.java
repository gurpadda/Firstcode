package Aug05;

public class DebitcardPayment extends Payment{
    @Override
    public void Validate() {
        System.out.println("payment validate for DebitCard");
    }

    @Override
    public void processPayment() {
        super.processPayment();
        System.out.println("Payment done for debit Card" );
    }
}
