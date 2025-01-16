package lab4.prob4c;

public class Hourly extends Employee {
    private double hourlyWage;
    private double hoursPerWeek;

    Hourly(double hourlyWage, double hoursPerWeek) {
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }


    @Override
    double calcGrossPay() {
        return hourlyWage * hoursPerWeek * 4;
    }
}
