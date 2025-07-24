public class Bank {
    String accHolderName;
    int accountNo;
    double accountBalance;
    String accountType;

    public Bank() {
    }

    public Bank(String accHolderName, int accountNo) {
        this.accHolderName = accHolderName;
        this.accountNo = accountNo;
    }

    public Bank(int accountNo, String accHolderName, double accountBalance, String accountType) {
        this.accountNo = accountNo;
        this.accHolderName = accHolderName;
        this.accountBalance = accountBalance;
        this.accountType = accountType;
    }

    public double deposit(double amount){
        accountBalance += amount;
        return accountBalance;



}
public double withdraw(double amount){
        accountBalance -= amount;
        return accountBalance;

}
public double getBalance(){
        return accountBalance;

}
public void printAccountInfo(){
    System.out.println("Welcome to Bank");
    System.out.println("Account Info");
    System.out.println("Account Holder Name is :" +accHolderName);
    System.out.println("Account Balance is :" +accountBalance);
    System.out.println("Account Type:" +accountType);

}
    }


