package U9T1;
public class Skateboard extends Vehicle {
    private int length;
    
    public Skateboard (int length, String name, int wheels) {
        super(name, wheels);
        this.length = length;
    }

    // returns length of skateboard in inches
    public int getLength() {
        return length;
    }

    public void doAKickflip() {
        System.out.println("Kickflip!");
    }
}
