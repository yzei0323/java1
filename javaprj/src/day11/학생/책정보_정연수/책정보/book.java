package 책정보;

public class book {

	String title;
	String author;
	int price;
	
	public book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return title + " " + author + " " + price;
		
	}
	
	public void printInfo() {
		System.out.println(title);
		System.out.println(author);
		System.out.println(price);
	}
	
	
}
