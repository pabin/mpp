package lab4.prob4e;

import java.util.List;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> list) {
        double totalSum = 0;

        for (Employee e : list) {
            totalSum += e.computeUpdatedBalanceSum();
        }
        return totalSum;
    }
}
