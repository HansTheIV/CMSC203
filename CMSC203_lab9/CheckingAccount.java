public class CheckingAccount extends BankAccount
{
    private static final double FEE = 0.15;
    public CheckingAccount(String name, int i)
    {
        super(name, i);
        setAccountNumber((getAccountNumber() + "-10"));

    }
    @Override
    public boolean withdraw(double amount)
    {
        double tempAmount = amount+FEE;
        return super.withdraw(tempAmount);
    }
}
