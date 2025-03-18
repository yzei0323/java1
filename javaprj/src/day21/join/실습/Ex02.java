package day21.join.실습;

public class Ex02 {

	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		
		a.start();
		b.start();
		
		
		// 메인스레드의 작업이 진행
		
		try {
			a.join();
			b.join();
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int total=0;
		total = a.getSum() + b.getSum();
		
		System.out.println("프로그램 종료");
	}

}
