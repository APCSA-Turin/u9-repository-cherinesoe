package U9T1;

public class Teacher extends Person {
    private String subjectTaught;

    public Teacher(String subjectTaught, String name, int age) {
        super(name, age);
        this.subjectTaught = subjectTaught;
    }

    public String getSubjectTaught() {return this.subjectTaught;}  
    
    public void driveToSchool(int minutes) {
        System.out.println("It took me " + minutes + " minutes to drive to school.");
    }
}
