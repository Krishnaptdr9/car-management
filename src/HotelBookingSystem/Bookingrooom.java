package HotelBookingSystem;

import carmangment.coustomer;

public class Bookingrooom {

	private int days;
	private Room room;
	private Coustmer coustmer;
	private double totalprice;
	
	
	public Bookingrooom(int days, Room room, Coustmer coustmer, double totalprice){
		super();
		this.days = days;
		this.room = room;
		this.coustmer = coustmer;
		this.totalprice = totalprice;
	}


	public int getDays() {
		return days;
	}


	public void setDays(int days) {
		this.days = days;
	}


	public Room getRoom() {
		return room;
	}


	public void setRoom(Room room) {
		this.room = room;
	}


	public Coustmer getCoustmer() {
		return coustmer;
	}


	public void setCoustmer(Coustmer coustmer) {
		this.coustmer = coustmer;
	}


	public double getTotalprice() {
		return totalprice;
	}


	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}


	@Override
	public String toString() {
		return "Bookingrooom [days=" + days + ", room=" + room + ", coustmer=" + coustmer + ", totalprice=" + totalprice
				+ "]";
	}
	
	
  
}

	

