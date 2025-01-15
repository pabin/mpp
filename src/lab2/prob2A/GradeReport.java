package lab2.prob2A;

public class GradeReport {
    private double gpa;
    private Student student;

    GradeReport(Student student, double gpa) {
        this.student = student;
        this.gpa = gpa;
    }

    public String getReport() {
        return this.student.getName() + " -> " + this.gpa;
    }
}
