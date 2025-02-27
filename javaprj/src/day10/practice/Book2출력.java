package day10.practice;

public class Book2출력 {

	public static void main(String[] args) {
		
		//2. 책정보(title, author, price)를 담을 수 있는 Book클래스를 정의하고 책정보 객체 3개를 만들고 출력하기

		Book2 b1 = new Book2("소년이온다","한강",13500);
		Book2 b2 = new Book2("모순","양귀자",11700);
		Book2 b3 = new Book2("급류","정대건",12600);
		
	
		System.out.println(b1.toString());
		System.out.println(b2.toString());
		System.out.println(b3.toString());
		
		
		
	}

}
