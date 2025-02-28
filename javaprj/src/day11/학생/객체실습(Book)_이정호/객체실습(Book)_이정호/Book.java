package day10객체배열;

public class Book {
	String title; //책 제목
	String author; //저자
	int price; //가격
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price) {
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
