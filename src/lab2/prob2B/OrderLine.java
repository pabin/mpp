package lab2.prob2B;

public class OrderLine {
    private String itemName;
    private int quantity;
    private double price;
    private Order order;

    OrderLine(Order order, String i, int q, double p) {
        this.itemName = i;
        this.quantity = q;
        this.price = p;
        this.order = order;
    }
}
