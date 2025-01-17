package lab4.prob4c;

import java.time.LocalDate;

public class Order {
    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    Order(int no, LocalDate date, double amount) {
        orderNo = no;
        orderDate = date;
        orderAmount = amount;
    }

    public double getOrderAmount() {
        return this.orderAmount;
    }
}
