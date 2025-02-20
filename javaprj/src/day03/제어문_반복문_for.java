package day03;

public class 제어문_반복문_for {

	public static void main(String[] args) {
		
		
		//안녕하세요 3번 출력
		
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		
		
		//반복문 => 반복제어변수
		
		for( int i=1; i<=3; i++) {
			System.out.println("안녕하세요");
		}
		
		
		//2단출력
		
		System.out.println(2*1);
		System.out.println(2*2);
		System.out.println(2*3);
		System.out.println(2*4);
		System.out.println(2*5);
		System.out.println(2*6);
		System.out.println(2*7);
		System.out.println(2*8);
		System.out.println(2*9);
		
		//반복문 사용할 수 있다 (같거나, 규칙이 있으면 )
		for(int i=1; i<=9; i++) {
			System.out.println(2*i);
		}
		
		for(int i=1; i<=9; i++) {
			System.out.println(2*i);
		}
		
		for(int i=1; i<=9; i++) {
			System.out.println(2*i);
		}
		
		System.out.println("=========>");
		//위의 3개의 2단 출력을 반복문으로 표현한 것
		for(int j=1; j<=3; j++) {
			//2단 반복    그러니까 2단 반복을 세번 반복해
			for(int i=1; i<=9; i++) {
				System.out.println(2*i);
			}
		}
		

	}

}
