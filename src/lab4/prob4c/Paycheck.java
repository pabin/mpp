package lab4.prob4c;

public class Paycheck {
    private double grossPay;
    private double fica;
    private double state;
    private double local;
    private double medicare;
    private double socialSecurity;

    Paycheck(double gp, double fica, double st, double loc, double mc, double ss) {
        this.grossPay = gp;
        this.fica = fica;
        this.state = st;
        this.local = loc;
        this.medicare = mc;
        this.socialSecurity = ss;
    }

    double getNetPay() {
        return grossPay - fica - state - local - medicare - socialSecurity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nGross Pay: " + grossPay + "\n");
        sb.append("FICA Tax: " + fica + "\n");
        sb.append("State Tax: " + state + "\n");
        sb.append("Local Tax: " + local + "\n");
        sb.append("Medicare: " + medicare + "\n");
        sb.append("Social Security: " + socialSecurity + "\n");
        sb.append("Net Payment: " + getNetPay() + "\n");

        return sb.toString();
    }
}
