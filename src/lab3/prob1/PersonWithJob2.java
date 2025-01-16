package lab3.prob1;

public class PersonWithJob2 {
    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    PersonWithJob2(String n, double s) {
        name = n;
        salary = s;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object aPerson) {
        if (aPerson == null) return false;
        if (!(aPerson instanceof PersonWithJob2)) return false;
        PersonWithJob2 p = (PersonWithJob2) aPerson;
        boolean isEqual = this.name.equals(p.getName()) &&
                this.getSalary() == p.getSalary();
        return isEqual;
    }

    public static void main(String[] args) {
        PersonWithJob2 p1 = new PersonWithJob2("Joe", 30000);
        Person p2 = new Person("Joe");
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }


}
