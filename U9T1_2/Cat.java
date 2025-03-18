package U9T1_2;

public class Cat extends Animal{
    private boolean hasPlayedWith;
    private String furColor;

    public Cat(String furColor, String name, int age, boolean vaccinated, boolean napped) {
        super(name, age, vaccinated, napped);
        this.furColor = furColor;
        hasPlayedWith = false;
    }

    public boolean getHasPlayedWith() {return hasPlayedWith;}

    public String getFurColor() {return furColor;}

    public void play() {
        System.out.println("This cat has been played with!");
        hasPlayedWith = true;
    }

    public void catnip() {
        System.out.println("This cat had catnip!");
    }
}
