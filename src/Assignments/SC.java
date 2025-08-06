package Assignments;

public class SC extends  BankOfCanada{
    double internalRate = 2.18;

    @Override
    public double rateOfInterest() {
        return super.rateOfInterest() + internalRate;
    }
}
