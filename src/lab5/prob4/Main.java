package lab5.prob4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        CustomerFactory cusFactory = new CustomerFactory();
        Customer customer = cusFactory.createCustomer("Bob");
        System.out.println("customer: " + customer.getName());

        OrderFactory orderFactory = new OrderFactory();

        Order order = orderFactory.createOrder(customer, LocalDate.now());
        order.addItem("Shirt");
        order.addItem("Laptop");
        System.out.println("order1: " + order);

        Order order2 = orderFactory.createOrder(customer, LocalDate.now());
        order2.addItem("Pants");
        order2.addItem("Knife set");
        System.out.println("order2: " + order2);
    }

    // Original Code
    public static void main2(String[] args) {
        Customer cust = new Customer("Bob");
        Order order = Order.newOrder(cust, LocalDate.now());
        order.addItem("Shirt");
        order.addItem("Laptop");

        order = Order.newOrder(cust, LocalDate.now());
        order.addItem("Pants");
        order.addItem("Knife set");

        System.out.println(cust.getOrders());
    }
}


