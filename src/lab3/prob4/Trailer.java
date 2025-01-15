package lab3.prob4;

public class Trailer implements Property {
    private Address address;

    @Override
    public double calculateRent() {
        return 500;
    }
}
