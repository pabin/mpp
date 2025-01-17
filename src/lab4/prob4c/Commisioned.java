package lab4.prob4c;

import java.time.LocalDate;
import java.util.ArrayList;

public class Commisioned extends Employee {
    private double baseSalary;
    private ArrayList<Order> orders = new ArrayList<>();

    Commisioned(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    void setOrder(Order order) {
        orders.add(order);
    }

    double getTotalCommission() {
        double totalCommission = 0;

        for (Order o : orders) {
            totalCommission += o.getOrderAmount();
        }
        return totalCommission;
    }


    @Override
    double calcGrossPay() {
        return baseSalary + getTotalCommission();
    }
}
