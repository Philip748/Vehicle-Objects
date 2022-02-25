package vehicle.types;

public abstract class Watercraft extends SteeredVehicle{
	
	public Watercraft(String name) {
		setName(name);
		setType(Type.FLOATED);
		setUnits("knots");
	}

}

