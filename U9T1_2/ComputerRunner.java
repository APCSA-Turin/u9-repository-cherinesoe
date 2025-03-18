package U9T1_2;
import java.lang.reflect.Method;

public class ComputerRunner {
    public static void main(String[] args) {
        Desktop desktop1 = new Desktop(18, 512, true);
        Laptop laptop1 = new Laptop(14, 256);
        Tablet tablet1 = new Tablet(10, 256, false);
        Computer computer1 = new Computer(15, 512);

        System.out.println("---test---");
        System.out.println(desktop1 instanceof Computer);
        System.out.println(desktop1 instanceof Desktop);
        System.out.println("------");
        System.out.println(laptop1 instanceof Computer);
        System.out.println(laptop1 instanceof Laptop);
        System.out.println("------");
        System.out.println(tablet1 instanceof Computer);
        System.out.println(tablet1 instanceof Tablet);
        System.out.println("------");
        System.out.println(computer1 instanceof Computer);
        System.out.println(computer1 instanceof Desktop);
        System.out.println(computer1 instanceof Laptop);
        System.out.println(computer1 instanceof Tablet);
    }
}
