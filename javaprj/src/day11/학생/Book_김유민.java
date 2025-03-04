package day11.학생;

public class Book_김유민 {
	
	String title;
	String author;
	int price;
	
	public Book_김유민() {
		
	}
	
	public Book_김유민(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return "책제목: "+title +" "+"저자: "+ author + " "+"가격: "+price;
	}
}
