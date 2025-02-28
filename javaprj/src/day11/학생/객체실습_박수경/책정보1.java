package day10_0227_학생관리;


public class 책정보1 {
	//1. 책정보 (title,  author, price )를   생성자와 toString매서드를 이용하여 저장하고 출력하기
	
	String title;
	String author;
	int price;
	
	public 책정보1(String title, String author, int price) {
		this.title=title;
		this.author=author;
		this.price=price;
	}
	/*
	public void printInfo() {
		System.out.println(title+"\n"+author+"\n"+price+"원");
	}
	*/
	public String toString() {
        return "제목 : "+title+"\n"+"저자 : "+author+"\n"+"가격 : "+price;
    }
}
