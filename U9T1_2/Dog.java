package U9T1_2;

public class Dog extends Animal{
    private boolean hasBeenWalked;
    private String breed;

    public Dog(String breed, String name, int age, boolean vaccinated, boolean napped) {
        super(name, age, vaccinated, napped);
        this.breed = breed;
        hasBeenWalked = false;
    }

    public boolean getHasBeenWalked() {return hasBeenWalked;}

    public String getBreed() {return breed;}

    public void walk() {
        System.out.println("This dog has been walked!");
        hasBeenWalked = true;
    }

    public void doATrick() {
        System.out.println("This dog did a trick!");
    }
}
