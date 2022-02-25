package vehicle.types;

public abstract class Vehicle {
	private String name;
	private Type type;
	private Direction direction;
	private double currentSpeed;
	private String units;
	
	public void stop() {
		setCurrentSpeed(0);
		setDirection(Direction.STATIONARY);
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	public void setCurrentSpeed(double currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUnits() { return units; }
	public void setUnits(String units) { this.units = units; }
	public String printSpeed() {
		return getCurrentSpeed()+units;
	}
}

enum Type {
	WHEELED, TRACKED, RAILED, SKIED, FLOATED
}

enum Direction {
	FORWARD, BACKWARD, LEFT, RIGHT, STATIONARY
}
