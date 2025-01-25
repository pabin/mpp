package lab8.prob2A;

import java.util.Collections;
import java.util.List;

public class EmployeeInfo {
    static enum SortMethod {BYNAME, BYSALARY}

    ;
    private SortMethod method;

    public EmployeeInfo(SortMethod method) {
        this.method = method;
    }

    //Comparators are unaware of the value in method
    public void sort(List<Employee> emps) {
        if (method == SortMethod.BYNAME) {
            Collections.sort(emps, new EmployeeComparator());
        } else if (method == SortMethod.BYSALARY) {
            Collections.sort(emps, new EmployeeSalaryComparator());
        }
    }

    public static void main(String[] args) {
        Employee joe1 = new Employee("Joe", 150000);
//        Employee joe2 = new Employee("Joe", 100000);
        Employee joe2 = new Employee("Joe", 150000);

        System.out.println(joe1.equals(joe2));

        EmployeeComparator nameComp = new EmployeeComparator();
        System.out.println(nameComp.compare(joe1, joe2));
    }
}



	
