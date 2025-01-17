package lab4.prob4e;

import java.util.ArrayList;

public class Employee {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    Employee(String name) {
        this.name = name;
    }

    public void addAccount(Account acc) {
        accounts.add(acc);
    }

    public double computeUpdatedBalanceSum() {
        double totalEmployeeSum = 0;

        for (Account a : accounts) {
            totalEmployeeSum += a.computeUpdatedBalance();
        }
        return totalEmployeeSum;
    }

    public String getName() {
        return this.name;
    }


}
