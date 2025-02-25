package day08.학생;;

public class 책정보출력 {

	public static void main(String[] args) {

		Book a = new Book();
		Book b = new Book();
		Book c = new Book();

		a.book_name = "신";
		a.author = "베르나르 베르베르";
		a.price = 52000;

		b.book_name = "코스모스";
		b.author = "칼 세이건";
		b.price = 18000;

		c.book_name = "지 지구의 운동에 대하여";
		c.author = "우오토";
		c.price = 48000;

		print1(a);
		print2(b);
		print3(c);
	}

	public static void print1(Book a) {
		System.out.println("책이름: " + a.book_name);
		System.out.println("작가: " + a.author);
		System.out.println(a.price + "원");
		System.out.println();
	}

	public static void print2(Book b) {
		System.out.println("책이름: " + b.book_name);
		System.out.println("작가: " + b.author);
		System.out.println(b.price + "원");
		System.out.println();
	}

	public static void print3(Book c) {
		System.out.println("책이름: " + c.book_name);
		System.out.println("작가: " + c.author);
		System.out.println(c.price + "원");
		System.out.println();
	}
}
