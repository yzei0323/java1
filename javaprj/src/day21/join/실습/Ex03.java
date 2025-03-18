package day21.join.실습;

public class Ex03 {

	public static void main(String[] args) {
		
		
		Counter c = new Counter();
		c.start();
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

		try {
			c.join(5000);	//특정시간만큼 c스레드 기다리기
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
		
	}

}
