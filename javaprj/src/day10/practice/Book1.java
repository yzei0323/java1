package day10.practice;

public class Book1 {

	//1. 책정보(title, author, price)를 생성자와 toString메서드를 이용하여 저장하고 출력하기

	String title;
	String author;
	int price;
	

	public Book1() {
		this.title = "소년이 온다";
		this.author = "한강";
		this.price = 13500;
	}
	
	
	public String toString() {
		return author+" 작가의 <"+ title +">는(은) "+ price +"원 입니다";
	}
	
}
