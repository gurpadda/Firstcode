package Aug05;

public class CreditCardPayment extends Payment{
    @Override
    public void Validate() {
        System.out.println("payment validate for CC");
    }

    @Override
    public void processPayment(double amount ) {
        //super.processPayment();
        System.out.println("payment done ="  +amount);
    }
}
