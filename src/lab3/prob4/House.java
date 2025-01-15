package lab3.prob4;

public class House implements Property {
    private int lotSize;
    private double rent;
    private Address address;

    House(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double calculateRent() {
        return 0.1 * this.lotSize;
    }
}
