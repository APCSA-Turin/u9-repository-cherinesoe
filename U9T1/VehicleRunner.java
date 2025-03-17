package U9T1;
public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBicycle = new Bicycle(10, "Cycle", 2);
        System.out.println(myBicycle.getName()); // inherited method
        System.out.println(myBicycle.getWheels()); // inherited method
        System.out.println(myBicycle.getGearCount());
        myBicycle.move(30); // inherited method
        myBicycle.turn(); // inherited method
        myBicycle.brake(); // inherited method
        myBicycle.ringBell();

        // my subclass
        Skateboard mySkateboard = new Skateboard(30, "Santa Cruz", 4);
        System.out.println(mySkateboard.getName()); // inherited method
        System.out.println(mySkateboard.getWheels()); // inherited method
        System.out.println(mySkateboard.getLength());
        mySkateboard.move(10); // inherited method
        mySkateboard.turn(); // inherited method
        mySkateboard.brake(); // inherited method
        mySkateboard.doAKickflip();
    }
}