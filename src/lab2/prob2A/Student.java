package lab2.prob2A;

public class Student {
    private String name;
    private GradeReport report;

    public Student(String name, double gpa) {
        this.name = name;
        this.report = new GradeReport(this, gpa);
    }

    public String getName() {
        return this.name;
    }

    public String getReport() {
        return this.report.getReport();
    }
}
