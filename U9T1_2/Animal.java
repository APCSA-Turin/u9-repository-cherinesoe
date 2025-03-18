package U9T1_2;

public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private boolean napped;

    public Animal(String name, int age, boolean vaccinated, boolean napped) {
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.napped = napped;
    }

    public String getName() {return name;}

    public int getAge() {return age;}

    public boolean getVaccinated() {return vaccinated;}

    public boolean getNapped() {return napped;}

    public void adopt() {
        System.out.println("This animal has been adopted!");
    }

    public void feed() {
        System.out.println("This animal has been fed!");
    }

    public void nap() {
        System.out.println("This animal took a nap!");
    }
}
