package carmangment;

public class coustomer extends Car{
	private static double basepricepardey;
	@SuppressWarnings("unused")
	private volatile  boolean isavailable;
	private String CoustomerId;
	private static String name;
	private int phonenumber;
	
	public coustomer(String coustomerId, String name, int phonenumber) {
		super(name, name, basepricepardey, isavailable(), name);
		CoustomerId = coustomerId;
		this.name = name;
		this.phonenumber = phonenumber;
	}
	private static boolean isavailable() {
		// TODO Auto-generated method stub
		return false;
	}
	public String getCoustomerId() {
		return CoustomerId;
	}
	public void setCoustomerId(String coustomerId) {
		CoustomerId = coustomerId;
	}
	public static String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public void add(coustomer coustomer) {
	// TODO Auto-generated method stub	
		
	}
	
}
