package day11.학생;

public class 김유민_Book {
	
	String title;
	String author;
	int price;
	
	public 김유민_Book() {
		
	}
	
	public 김유민_Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return "책제목: "+title +" "+"저자: "+ author + " "+"가격: "+price;
	}
}
