package carmangment;

public class Car {
	private String carId;
	private String model;
	private String brannd;
	protected double basepricepardey;
	private volatile  boolean isavailable = true;
	
	public Car(String model, String brannd, double basepricepardey, boolean isavailable, String carId) {
		super();
		this.carId = carId;
		this.model = model;
		this.brannd = brannd;
		this.basepricepardey = basepricepardey;
		this.isavailable = isavailable;
	}

	public Car() {
		// TODO Auto-generated constructor stub
	}

	public String getCarId() {
		return carId;
	}

	public void setCarId(String carId) {
		this.carId = carId;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrannd() {
		return brannd;
	}

	public void setBrannd(String brannd) {
		this.brannd = brannd;
	}

	public double getBasepricepardey() {
		return basepricepardey;
	}

	public void setBasepricepardey(double basepricepardey) {
		this.basepricepardey = basepricepardey;
	}

	public  boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}

	public void rent() {
		this.isavailable = false;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return carId + " " + model + " "+ brannd + " " + basepricepardey ;
	}

	public static void add(Car car) {
		// TODO Auto-generated method stub
		
	}
	
	
}
