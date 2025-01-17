package lab4.prob4e;

public class CheckingAccount extends Account {
    private String accountId;
    private double balance;
    private double monthlyFee;

    CheckingAccount(String id, double fee, double bal) {
        accountId = id;
        balance = bal;
        monthlyFee = fee;
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
        return this.balance - this.monthlyFee;
    }
}
