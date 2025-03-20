package U9T3;

public class Taxi extends Car { 
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {return fareCollected;}

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Fare collected: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += (numRiders * farePerRider);
        if (getPassengers() >= 4 && !isDiscountApplied()) {
            setTollFee(getTollFee() * .5);
            setDiscountApplied(true);
        }
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        fareCollected += farePerRider * (getPassengers() - 1);
        return dropOffPassengers(getPassengers() - 1);
    }

    @Override
    public void hasTaxiLicense() {
        System.out.println("This vehicle has a taxi license.");
    }
}
