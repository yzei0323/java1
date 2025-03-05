package day11.학생;

public class 정연수_book {

	String title;
	String author;
	int price;
	
	public 정연수_book(String title, String author, int price) {
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
