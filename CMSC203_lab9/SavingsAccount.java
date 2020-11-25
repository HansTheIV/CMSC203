public class SavingsAccount extends BankAccount {
    private double rate = 0.025;
    int savingsNumber = 0;
    String accountNumber;
    public SavingsAccount(String name, int i) {
        super(name, i);
        accountNumber = (super.getAccountNumber() + "-" + String.valueOf(savingsNumber));
    }
    public SavingsAccount(SavingsAccount account, int i) {
        super(account, i);
        savingsNumber++;
        accountNumber = (super.getAccountNumber() + "-" + String.valueOf(savingsNumber));
    }
    public void postInterest()
    {
        double tempInterest = getBalance()*(rate/12.0);
        deposit(tempInterest);
    }
    @Override
    public String getAccountNumber()
    {
        return accountNumber;
    }

}
