package lab3.prob2;

import java.util.ArrayList;

public class LandlordInfo {
    private ArrayList<Building> buildings = new ArrayList<>();
    private String name;
    private double profit;

    LandlordInfo(String name) {
        this.name = name;
    }

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public double calcProfits() {
        double totalProfit = 0;
        for (Building b: this.buildings) {
            double incomePerBuilding = 0;
            double expensePerBuilding = b.getMaintenenceCost();
            for (Apartment a : b.getApartments()) {
                incomePerBuilding += a.getRent();
            }
            double  profitPerBuilding = incomePerBuilding - expensePerBuilding;
            totalProfit += profitPerBuilding;
        }

        this.profit = totalProfit;
        return totalProfit;
    }

    public double getProfit() {
        return this.profit;
    }

}
