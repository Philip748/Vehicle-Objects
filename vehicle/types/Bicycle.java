package vehicle.types;

public class Bicycle extends SteeredVehicle{
	
	public Bicycle(String name) {
		setName(name);
		setType(Type.WHEELED);
		setUnits("km/hr");
	}

}
