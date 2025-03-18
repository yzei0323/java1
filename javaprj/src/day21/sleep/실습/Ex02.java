package day21.sleep.실습;

public class Ex02 {

	public static void main(String[] args) {
		
		Counter th = new Counter();
		th.start(); //쓰레드 실행하기
	}

}


class Counter extends Thread{
	
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i+"count");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			

		}
	}
}