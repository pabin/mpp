package lab4.prob4c;

import java.time.LocalDate;

public class Driver {
    public static void main(String[] args) {
        Salaried salariedEmp = new Salaried(9500);
        Paycheck salariedPaycheck = salariedEmp.calcCompensation();
        System.out.println("Paycheck Salaried Employee: " + salariedPaycheck);

        System.out.println();
        Hourly hourlyEmp = new Hourly(30, 40);
        Paycheck hourlyPaycheck = hourlyEmp.calcCompensation();
        System.out.println("Paycheck Hourly Employee: " + hourlyPaycheck);


        LocalDate date1 = LocalDate.now();
        LocalDate lastMonthDate = date1.minusMonths(1);

        Order order1 = new Order(1, lastMonthDate, 2500);
        Order order2 = new Order(2, lastMonthDate, 1500);
        Order order3 = new Order(3, lastMonthDate, 4000);

        System.out.println();
        Commisioned commisionedEmp = new Commisioned(2000);
        commisionedEmp.setOrder(order1);
        commisionedEmp.setOrder(order2);
        commisionedEmp.setOrder(order3);

        Paycheck commissionedPaycheck = commisionedEmp.calcCompensation();
        System.out.println("Paycheck Commisioned Employee: " + commissionedPaycheck);

    }
}
