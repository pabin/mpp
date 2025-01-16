package lab4.prob4c;

public abstract class Employee {
    private Paycheck paycheck;

    public Paycheck calcCompensation() {
        double grossPay = calcGrossPay();
        double fica = 0.23 * grossPay;
        double state = 0.05 * grossPay;
        double local = 0.01 * grossPay;
        double medicare = 0.03 * grossPay;
        double social = 0.075 * grossPay;

        paycheck = new Paycheck(grossPay, fica, state, local, medicare, social);
        return paycheck;
    }

    abstract double calcGrossPay();
}
