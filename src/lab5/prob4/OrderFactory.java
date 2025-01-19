package lab5.prob4;

import java.time.LocalDate;

public class OrderFactory {
    public Order createOrder(Customer cus, LocalDate date) {
        return Order.newOrder(cus, date);
    }

}
