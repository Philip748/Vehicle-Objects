package vehicle.types;

public abstract class RailedVehicle extends DrivenVehicle{
	int nocarriages;
	
	public RailedVehicle(String name) {
		setName(name);
		setType(Type.RAILED);
		setUnits("miles/hr");
	}

	public int getNocarriages() {
		return nocarriages;
	}

	public void setNocarriages(int nocarriages) {
		this.nocarriages = nocarriages;
	}
	
}
