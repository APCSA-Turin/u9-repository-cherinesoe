package U9T1_2;

public class Computer {
    private int screenSize;
    private int memory;

    public Computer(int screenSize, int memory) {
        this.screenSize = screenSize;
        this.memory = memory;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public int getMemory() {
        return memory;
    }

    public void installOperatingSystem() {
        System.out.println("installing OS...");
    }

    public void printInfo() {
        System.out.println("screen size: " + screenSize);
        System.out.println("memory: " + memory);
    }
}
