package day11.학생;

public class 최하은_책 {

	String title;
	String author;
	int price;
	
	
	public 최하은_책(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public String toString() {
		return "제목 : " + title + "\n저자 : " + author + "\n가격 : " + price + "원";	
	}

 	public void print() {
 		System.out.println("제목 : " + title);
 		System.out.println("저자 : " + author);
 		System.out.println("가격 : " + price);
 		System.out.println("");
 	}
	
}
