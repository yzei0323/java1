package day11.학생;

public class Book_이정호 {
	String title; //책 제목
	String author; //저자
	int price; //가격
	
	public Book_이정호() {
		
	}
	
	public Book_이정호(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return "제목: " + title + ", 저자: " + author + ", 가격: " + price;
	}
	
	public void getPrice(int price) {
		this.price = price;
	}
	public void getTitle(String title) {
		this.title = title;
	}
}
