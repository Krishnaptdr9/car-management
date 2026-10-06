package HotelBookingSystem;

public class Room {
	private String type;
	private int roomnumber;
	private double price;
	private boolean available;
	
	public Room(String type, int roomnumber, double price, boolean available) {
		super();
		this.type = type;
		this.roomnumber = roomnumber;
		this.price = price;
		this.available = available;
	}


	public int getRoomnumber() {
		return roomnumber;
	}

	public void setRoomnumber(int roomnumber) {
		this.roomnumber = roomnumber;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	@Override
	public String toString() {
	    return "Room " + roomnumber + " [" + type + "] - Price: " + price +
	           (available ? " (Available)" : " (Booked)");
	}


}

