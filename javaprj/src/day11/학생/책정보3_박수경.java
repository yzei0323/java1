package day11.학생;

public class 책정보3_박수경 {
	//3. 책정보(title,author, price)를 담을 수 있는 Book 클래스를 정의하고 책정보 3개를 객체 배열로 만들고 출력
	String title;
	String author;
	int price;

	
	public 책정보3_박수경(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public String toString() {
		return title+"\n"+author+"\n"+price;
	}
}
