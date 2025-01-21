package lab2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private List<OrderLine> orderLines = new ArrayList<>();


    public Order(int on, String item, int qty, double price) {
        OrderLine orderLineItem = new OrderLine(this, item, qty, price);
        this.orderNum = on;
        orderLines.add(orderLineItem);
    }
}
