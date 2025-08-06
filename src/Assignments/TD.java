package Assignments;

public class TD extends BankOfCanada
{
    double internalRate = 1.18;

    @Override
    public double rateOfInterest() {
        return super.rateOfInterest() + internalRate;
    }
}
