package day11.패키지와import.a;

import day11.패키지와import.b.Snack;

public class 프로그램작성2 {

	public static void main(String[] args) {


		Snack s = new Snack("오징어땅콩", 2500);
		//다른 패키지에 있음 Snack클래스 오 그래서 import로 쓸 수 있다
		
		//day11.패키지와import.b.Snack s = new day11.패키지와import.b.Snack("오징어땅콩", 2500);
		//그냥 이렇게 써도됨
		
		
		System.out.println(s.toString());

	}

}
