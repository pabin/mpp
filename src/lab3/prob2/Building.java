package lab3.prob2;

import java.util.ArrayList;

public class Building {
    private ArrayList<Apartment> apartments = new ArrayList<>();
    private double maintenanceCost;

    Building(double a, double b) {
        this.maintenanceCost = a;
        Apartment apart = new Apartment(b);
        addApartment(apart);
    }

    public void addApartment(Apartment apartment) {
        this.apartments.add(apartment);
    }

    public ArrayList<Apartment> getApartments() {
        return this.apartments;
    }

    public double getMaintenenceCost() {
        return this.maintenanceCost;
    }

}
