package day11.학생;

public class 권지언_Book {

	private String title;
	private String author;
	private int price;

	public 권지언_Book() {

	}

	public 권지언_Book(String title, String author, int price) {
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
