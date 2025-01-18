package lab5.prob4;

import java.time.LocalDate;

public class CusOrderFactory {
    public static Order createOrder(Customer cus, LocalDate date) {
        return Order.newOrder(cus, date);
    }

}
