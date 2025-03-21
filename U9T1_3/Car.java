public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;
    
    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }
  
    public boolean isElectric() {
        return electric;
    }
  
    public boolean isDiscountApplied() {
        return discountApplied;
    }

    public void printCar() {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getTollFee());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Electric?: " + electric);
        System.out.println("Discount applied?: " + discountApplied);
    }

    public boolean dropOffPassengers(int numOut) {
        int current = getPassengers();
        if (numOut > current) {
            return false;
        } else {
            setPassengers(current - numOut);
            return true;
        }
    }

    public void applyDiscount() {
        if (electric && !discountApplied) {
            setTollFee(getTollFee() * 0.5);
            discountApplied = true;
        }
    }

    public void setDiscountApplied(boolean isApplied) {
        discountApplied = isApplied;
    }
}