package day21.interrupt.실습;

public class Counter3 extends Thread{

	@Override
	public void run() {
		
		for(int i=10; i>0; i--) {
			//System.out.println("인터럽트상태="+isInterrupted());
			if(isInterrupted()) {	//isInterrupted() => true or false
									//true => 외부에서 신호가 옴
									//false => 외부에서 신호가 없음
				System.out.println("인터럽트 발생하여 종료하겠습니다");
				return;
			}
			
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
				//interrupt();
				return;
			}
			
			System.out.println(i);
		}
	}
}
