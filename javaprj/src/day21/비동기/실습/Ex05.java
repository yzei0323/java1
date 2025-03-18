package day21.비동기.실습;

public class Ex05 {

	public static void main(String[] args) {


		// Runnable 인터페이스를 구현하는 3번째 방법 : 람다식
		// 익명클래스를 더 축약된 형태로 사용 가능함
		// 구현해야할 메서드(추상메서드)가 한 개인 인터페이스만 가능하다
		
		/*
		for( int i=1; i<=100; i++) {
			System.out.println("하이");
		}
		*/
		
		Thread th = new Thread(()-> {
			for( int i=1; i<=100; i++) {
				System.out.println("하이");
				}
			});
		th.start();
		
		/*
		for( int i=1; i<=100; i++) {
			System.out.println("바이");
		}
		*/
		
		Thread th2 = new Thread(()-> {
			for( int i=1; i<=100; i++) {
				System.out.println("바이");
				}
			});
		th2.start();

	}

}
