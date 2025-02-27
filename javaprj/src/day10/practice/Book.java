package day10.practice;

public class Book {
	String title;
	String author;
	int price;
	
	//생성자
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	
	public String toString() {
		return author+" 작가의 <"+ title +">는(은) "+ price +"원 입니다";
	}
	
	
	//제목 변경 메서드
	public void setTitle(String title) {
		this.title = title;
	}
	
	//제목 변경 메서드
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//제목 변경 메서드
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
