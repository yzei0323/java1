package day10.practice;

public class Book3출력 {

	public static void main(String[] args) {
		
		//3. 책정보(title, author, price)를 담을 수 있는 Book클래스를 정의하고 책정보 객체 3개를 객체배열로 만들고 출력하기

		Book3 b1 = new Book3("소년이온다","한강",13500);
		Book3 b2 = new Book3("모순","양귀자",11700);
		Book3 b3 = new Book3("급류","정대건",12600);
		
	
		Book3[] books = {b1, b2, b3};
		
		for(int i=0; i<books.length; i++) {
			System.out.println(books[i].toString());
		}
	
	}

}
