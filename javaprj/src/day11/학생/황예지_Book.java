package day11.학생;

public class 황예지_Book {
	String title;
	String author;
	int price;
	
	//생성자
	public 황예지_Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	//책정보 반환 메서드
	public String toString() {
		return author+" 작가의 《"+ title +"》는(은) "+ price +"원 입니다";
	}
	
	//setter
	//제목 변경 메서드
	public void setTitle(String title) {
		this.title = title;
	}
	//작가 변경 메서드
	public void setAuthor(String author) {
		this.author = author;
	}
	//가격 변경 메서드
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
