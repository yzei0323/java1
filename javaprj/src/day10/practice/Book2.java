package day10.practice;

public class  Book2{

	//2. 책정보(title, author, price)를 담을 수 있는 Book클래스를 정의하고 책정보 객체 3개를 만들고 출력하기
	String title;
	String author;
	int price;
	
	
	public Book2(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return author+" 작가의 《"+ title +"》는(은) "+ price +"원 입니다";
	}
	
	
}
