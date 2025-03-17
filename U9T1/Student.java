package U9T1;

public class Student extends Person {
    private double gpa;

    public Student(double gpa, String name, int age) {
        super(name, age);
        this.gpa = gpa;
    }

    public double getGPA() {return this.gpa;}

    public void eatBreakfast(String breakfast) {
        System.out.println("I ate " + breakfast + " for breakfast.");
    }
}
