package lab4.prob4c;

import java.time.LocalDate;

public class Order {
    private Commisioned orderedBy;
    private int orderNo;
    private LocalDate orderDate;
    private double orderAmount;

    Order(Commisioned by, int no, LocalDate date, double amount) {
        orderedBy = by;
        orderNo = no;
        orderDate = date;
        orderAmount = amount;
    }
}
