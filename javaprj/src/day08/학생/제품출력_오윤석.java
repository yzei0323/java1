package day08.학생;

public class 제품출력_오윤석 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product a = new Product();
		Product b = new Product();
		Product c = new Product();

		a.category = "음식";
		a.name = "라면";
		a.price = 1500;

		b.category = "전자제품";
		b.name = "무선이어폰";
		b.price = 200000;

		c.category = "음료";
		c.name = "콜라";
		c.price = 2000;

		item1(a);
		item2(b);
		item3(c);

	}

	public static void item1(Product a) {
		System.out.println("제품종류:" + a.category);
		System.out.println("제품이름:" + a.name);
		System.out.println("제품가격:" + a.price);
		System.out.println("================");
	}

	public static void item2(Product b) {
		System.out.println("제품종류:" + b.category);
		System.out.println("제품이름:" + b.name);
		System.out.println("제품가격:" + b.price);
		System.out.println("================");
	}

	public static void item3(Product c) {
		System.out.println("제품종류:" + c.category);
		System.out.println("제품이름:" + c.name);
		System.out.println("제품가격:" + c.price);
	}

}
