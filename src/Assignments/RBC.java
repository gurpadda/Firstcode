package Assignments;

public class RBC extends BankOfCanada{
    double internalRate = 3.12;

    @Override
    public double rateOfInterest() {
        return super.rateOfInterest() + internalRate;
    }
}
