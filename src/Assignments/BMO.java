package Assignments;

public class BMO extends BankOfCanada {
    double internalRate = 1.12;

    @Override
    public double rateOfInterest() {
        return super.rateOfInterest() + internalRate;
    }
}
