package day10.실습;

public class BookInfo2 {

	 String title;
	 String author;
	 int price;
	
	
	public BookInfo2() {
		
	}
	
	public BookInfo2 (String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
		
	}
	
//	public void printInfo() {
//		System.out.println("책 제목 : " + title);
//		System.out.println("책 저자 : " + author);
//		System.out.println("책 가격 : " + price);
//		System.out.println();
//	}
	
	public String toString() {
		return "책 제목 : " + title + ", 책 저자 : " + author + ", 책 가격 : " + price + "원";
	}
	
	
	
}
