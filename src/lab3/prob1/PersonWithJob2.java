package lab3.prob1;

public class PersonWithJob2 {
    private Person person;
    private double salary;

    public double getSalary() {
        return salary;
    }

    PersonWithJob2(Person p, double s) {
        person = p;
        salary = s;
    }

    public Person getPerson() {
        return person;
    }

    public static void main(String[] args) {
        Person p2 = new Person("Joe");
        PersonWithJob2 p1 = new PersonWithJob2(p2, 30000);
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.person.getName().equals(p2.getName()));
        System.out.println("p2.equals(p1)? " + p2.getName().equals(p1.person.getName()));
    }


}
