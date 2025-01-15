package lab3.prob4;

public class Condo implements Property{
    private int numberOfFloors;
    private Address address;

    Condo(int numOfFloors) {
        this.numberOfFloors = numOfFloors;
    }

    @Override
    public double calculateRent() {
        return 400 * this.numberOfFloors;
    }
}
