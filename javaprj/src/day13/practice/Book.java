package day13.practice;

public class Book {

	String title;
	String author;
	int price;
	double rating;
	
	
	
	public Book(String title, String author, int price, double rating) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.rating = rating;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
	
	public void printInfo() {
		System.out.println("제목: " + title + ", 저자: " + author + ", 가격: " + price + ", 평점: " + rating);
		
	}
	
}
