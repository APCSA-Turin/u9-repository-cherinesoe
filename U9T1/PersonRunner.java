package U9T1;

public class PersonRunner {
    public static void main(String[] args) {
        Person human = new Person("Cherine", 16);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println();

        Student s1 = new Student(99.75, "Jason", 16);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGPA());
        s1.eatBreakfast("croissant");
        System.out.println();

        // i forgot
        Teacher t1 = new Teacher("APCSA", "Ms. Turin", 30);
        System.out.println(t1.getName());
        System.out.println(t1.getAge());
        System.out.println(t1.getSubjectTaught());
        t1.driveToSchool(30);
    }
}
