package vehicle.types;

public abstract class DrivenVehicle extends Vehicle {

    public void drive(Direction direction, double speed) {
        setDirection(direction);
        setCurrentSpeed(speed);
    }

}
