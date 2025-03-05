package day11.학생;

public class 이수민_BookInfo2 {

	private String title;
	private String author;
	private int price;
	int quantity;
	int totalPrice;
	
	public 이수민_BookInfo2() {
		
	}
	public 이수민_BookInfo2(String title, String author, int price, int quantity) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.quantity = quantity;
	}
	
	public String toString() {
		return "제목: "+title+", 작가: "+author+", 가격: "+price+", 수량: "+quantity+", 총 금액: "+totalPrice;
	}
	
	public int calcTotal() {
		totalPrice=price*quantity;
		return totalPrice;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
