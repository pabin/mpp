package lab5.prob4;

public class CustomerFactory {
    public Customer createCustomer(String name) {
        return new Customer(name);
    }
}
