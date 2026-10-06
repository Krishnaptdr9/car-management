package carmangment;

public class Rental {
	private Car car;
	private coustomer coustomer;
	private int days;
	public carmangment.Car getcar;
	public Rental(carmangment.Car car, carmangment.coustomer coustomer, int days) {
		super();
		this.car = car;
		this.coustomer = coustomer;
		this.days = days;
	}
	
	public Rental(){
		super();
		// TODO Auto-generated constructor stub
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public coustomer getCoustomer() {
		return coustomer;
	}
	public void setCoustomer(coustomer coustomer) {
		this.coustomer = coustomer;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	
}
