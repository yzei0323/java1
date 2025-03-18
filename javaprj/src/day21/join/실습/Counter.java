package day21.join.실습;

public class Counter extends Thread{
	
	@Override
	public void run() {
		for(int i=10; i>0; i--) {
			
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
