package lab4.prob4c;

public class Driver {
    public static void main(String[] args) {
        Salaried salariedEmp = new Salaried(9500);
        Paycheck salariedPaycheck = salariedEmp.calcCompensation();
        System.out.println("Paycheck Salaried Employee: " + salariedPaycheck);

        System.out.println();
        Hourly hourlyEmp = new Hourly(30, 40);
        Paycheck hourlyPaycheck = hourlyEmp.calcCompensation();
        System.out.println("Paycheck Hourly Employee: " + hourlyPaycheck);

        // TO DO:
        // implement order
        // add order for commissioned employee
        // filter outs the orders by emp and sum total amount and pass to calc paycheck

//        System.out.println();
//        Commisioned commisionedEmp = new Commisioned(2000, 25000);
//        Paycheck commissionedPaycheck = commisionedEmp.calcCompensation();
//        System.out.println("Paycheck Commisioned Employee: " + commissionedPaycheck);


    }
}
