package lab2.prob2B;

public class Order {
    private int orderNum;
    private OrderLine orderLine;

    public Order(int on, String item, int qty, double price) {
        OrderLine orderLineItem = new OrderLine(item, qty, price);
        this.orderNum = on;
        this.orderLine = orderLineItem;
    }
}
