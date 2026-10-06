package labrary;


import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;

class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	
	int id;
	String Title;
	String Author;
	boolean Issued;
	
	public Book(int id, String title, String author, boolean issued) {
		super();
		this.id = id;
		Title = title;
		Author = author;
		Issued = issued;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + "," + Title + "," + Author + "," + Issued;
	}
	
	
	}

public class Labrary1 {
	
	static final String FILE_NAME = "Library.ser";
	
	static Array<Book> books = new ArrayList<>();
	
	public static void addBook(Book b) {
		books.add(b);
		savetoFile();
		System.out.println("Book added Successfully ! :" + b.Title);
		
	}
	
	public static void issueBook(int id ) throws Exception{
		for(Book b : books) {
			if(b.id == id ) {
				if(b.Issued)  throw new Exception ( "Book already siuued ! :");
				
					b.Issued = true;
				savetoFile();
				System.out.println("Book  isuued : " + b.Title);
				return;
				
			}
		}
		throw new Exception ( "Book not Found please try again and Login  ! : ");
		
	}
	
	private static void savetoFile() {
		// TODO Auto-generated method stub
		
	}
	public static void main(String[] args) {
		
	}
}