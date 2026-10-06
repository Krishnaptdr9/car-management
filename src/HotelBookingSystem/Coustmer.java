package HotelBookingSystem;

public class Coustmer {
	private static String name;
	private int id;
	private String ContectDeteils;
	
	
	public Coustmer(String name, int id, String contectDeteils) {
		super();
		this.name = name;
		this.id = id;
		ContectDeteils = contectDeteils;
	}


	public static String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getContectDeteils() {
		return ContectDeteils;
	}


	public void setContectDeteils(String contectDeteils) {
		ContectDeteils = contectDeteils;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		 return "Customer [ID=" + id + ", Name=" + name + ", Contact=" + name + "]";
	}
	
	
	
	
	
}
