package lab2;

import lab2.prob2A.Student;
import lab2.prob2B.Order;

public class Driver {
    public static void main(String[] args) {
        Student student1 = new Student("Bill", 3.80);
        Student student2 = new Student("Bob", 3.90);

        Order myOrder1 = new Order(1, "Chair", 5, 500);
        Order myOrder2 = new Order(1, "Table", 2, 750);

        System.out.println(student1.getName());
        System.out.println(student1.getReport());
    }
}
