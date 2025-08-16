package library;

public class book {
	private int id;
	private String title;
	private String author;
	private int copies;
	public book(int id,String title,String author,int copies) {
		this.id = id ;
		this.title = title;
		this.author = author;
		this.copies = copies;
	}
	public int getId() {
		return id;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	public int getCopies() {
		return copies;
	}
	void display() {
		System.out.println("Book Details \n");
		System.out.println("ID : "+id);
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("Copies : "+copies);
	}
	
}
