package vehicle.types;

public abstract class MotorVehicle extends DrivenVehicle{
	
	private int nowheels;
	
	public MotorVehicle(String name) {
		setName(name);
		setType(Type.WHEELED);
	}

	public int getNowheels() { return nowheels; }

	public void setNowheels(int nowheels) {
		this.nowheels = nowheels;
	}

}
