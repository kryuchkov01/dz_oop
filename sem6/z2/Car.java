package sem6.z2;

public class Car extends Vehicle implements SpeedCalculation{
    private double carAllowedSpeed;

    public Car(int maxSpeed, String type, double carAllowedSpeed) {
        super(maxSpeed, type);
        this.carAllowedSpeed = carAllowedSpeed;
    }

    public double getCarAllowedSpeed() {
        return carAllowedSpeed;
    }

    @Override
    public void calculateAllowedSpeed(int maxSpeed) {
        carAllowedSpeed = maxSpeed * 0.8;
        System.out.println(carAllowedSpeed);
    }
    
}
