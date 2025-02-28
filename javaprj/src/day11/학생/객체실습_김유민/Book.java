package day10실습;

public class Book {
	
	String title;
	String author;
	int price;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return "책제목: "+title +" "+"저자: "+ author + " "+"가격: "+price;
	}
}
