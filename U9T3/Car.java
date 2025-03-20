package U9T3;

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

    @Override
    public void printInfo() {
        super.printInfo();
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

    @Override
    public double calculateTollPrice() {
        if (getPassengers() > 4) {
            return getTollFee() * 4;
        } else {
            return super.calculateTollPrice();
        }
    }
}