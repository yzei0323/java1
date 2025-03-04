package day11.학생;

public class Book_권지언 {

	private String title;
	private String author;
	private int price;

	public Book_권지언() {

	}

	public Book_권지언(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String toString() {
		return "제목: "+title + " 작가: " + author + " 가격: " + price + "원";
	}
	
	public void Settitle(String title) {
		this.title = title;
	}
	
	public void Setauthor(String author) {
		this.author = author;
	}
	
	public void Setprice(int price) {
		this.price = price;
	}
}
