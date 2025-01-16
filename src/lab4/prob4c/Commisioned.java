package lab4.prob4c;

public class Commisioned extends Employee {
    private double baseSalary;
    private double commission;

    Commisioned(double baseSalary, double commission) {
        this.baseSalary = baseSalary;
        this.commission = commission;
    }


    @Override
    double calcGrossPay() {
        return baseSalary + commission;
    }
}
