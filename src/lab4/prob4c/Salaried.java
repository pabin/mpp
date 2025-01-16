package lab4.prob4c;

public class Salaried extends Employee {
    private double monthlySalary;

    Salaried(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }


    @Override
    double calcGrossPay() {
        return this.monthlySalary;
    }
}
