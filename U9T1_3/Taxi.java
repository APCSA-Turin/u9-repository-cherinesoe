import U9T3.Car;

public class Taxi extends Car { 
    private double fareCollected;

    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }

    public double getFareCollected() {return fareCollected;}

    public void printTaxi() {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric?: " + isElectric());
        System.out.println("Discount applied?: " + isDiscountApplied());
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
}
