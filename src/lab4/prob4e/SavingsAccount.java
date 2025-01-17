package lab4.prob4e;

public class SavingsAccount extends Account {
    private String accountId;
    private double balance;
    private double interestRate;


    SavingsAccount(String id, double rate, double bal) {
        accountId = id;
        balance = bal;
        interestRate = rate;
    }

    @Override
    public String getAccountId() {
        return this.accountId;
    }

    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public double computeUpdatedBalance() {
        return balance + balance * interestRate;
    }
}
