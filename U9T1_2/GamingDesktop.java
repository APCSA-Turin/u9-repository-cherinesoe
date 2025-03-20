package U9T1_2;

public class GamingDesktop extends Desktop{
    private String graphicsCard;

    public GamingDesktop(int screenSize, int memory, boolean monitorIncluded, String graphicsCard) {
        super(screenSize, memory, true);
        this.graphicsCard = graphicsCard;
    }

    public String getGraphicsCard() {return graphicsCard;}

    public void updateGraphicsCard() {
        System.out.println("Graphics card updated!");
    }
}
