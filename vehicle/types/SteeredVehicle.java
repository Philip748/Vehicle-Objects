package vehicle.types;

public abstract class SteeredVehicle extends Vehicle {
    private double steering;

    public void steer(double degree, double speed) {
        setCurrentSpeed(speed);
        setSteering(degree);
    }

    public double getSteering() {
        return steering;
    }

    public void setSteering(double degrees) {
        this.steering = degrees;
    }

}
