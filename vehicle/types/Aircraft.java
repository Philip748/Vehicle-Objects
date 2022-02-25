package vehicle.types;

public abstract class Aircraft extends SteeredVehicle{
	
	public Aircraft(String name) {
		setName(name);
		setType(Type.SKIED);
		setUnits("km/hr");
	}

}

