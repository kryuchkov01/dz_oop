package sem6.z2;

public class Bus extends Vehicle implements SpeedCalculation{
    private double busAllowedSpeed;

    public Bus(int maxSpeed, String type, int busAllowedSpeed) {
        super(maxSpeed, type);
        this.busAllowedSpeed = busAllowedSpeed;
    }

    public double getBusAllowedSpeed() {
        return busAllowedSpeed;
    }

    @Override
    public void calculateAllowedSpeed(int maxSpeed) {
        busAllowedSpeed = maxSpeed * 0.6;
        System.out.println(busAllowedSpeed);
    }
        
}
