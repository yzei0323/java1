package day21.interrupt.실습;

public class Ex02 {

	public static void main(String[] args) {
		
		
		Counter2 c = new Counter2();
		c.start();
		
		System.out.println(c.isInterrupted()); 	//false
		
		//
		
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//C스레드에게 신호주기
		c.interrupt();
		System.out.println(c.isInterrupted()); 	//true
		
	}

}
