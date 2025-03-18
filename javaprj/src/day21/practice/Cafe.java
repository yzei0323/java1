package day21.practice;

public class Cafe {
	
	private Thread cleanUpThread;
	private Thread makeDrinkThread;
	private Thread sayHelloThread;
	private Thread orderThread;
	
	
	public void 청소하기() {
		cleanUpThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(!Thread.currentThread().isInterrupted()) {
					System.out.println("청소하는 중.. 컵은 이쪽으로 주세요");
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						//e.printStackTrace(); 아니 이거 에러?메세지 출력해주는거였어 나몰랐어
						return;
					}
				}
			}
		});
		cleanUpThread.start();
	}
	
	public void 음료만들기() {
		makeDrinkThread = new Thread(new Runnable() {

			@Override
			public void run() {
				while(!Thread.currentThread().isInterrupted()) {
					System.out.println("제발 아메리카노아메리카노아메리카노");
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						//e.printStackTrace();
						return;
					}
				}
			}			
		});
		makeDrinkThread.start();
	}
	
	public void 인사하기() {
		sayHelloThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(!Thread.currentThread().isInterrupted()) {
					System.out.println("안녕하세요 할리스입니다..~*^^*");
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						//e.printStackTrace();
						return;
					}
				}				
			}
		});
		sayHelloThread.start();
	}
	
	public void 주문받기() {
		orderThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while(true) {
					System.out.println("주문하시겠어요?");
					try {
						Thread.sleep(500);
					}catch(InterruptedException e) {
						e.printStackTrace(); 
						return;
					}
				}
			}
		});
		orderThread.start();
	}
	
	public void 카운터() {
		System.out.println("카운터에서 주문을 받습니다! 청소,음료,인사 스레드 중지 요청");
		cleanUpThread.interrupt();
		makeDrinkThread.interrupt();
		sayHelloThread.interrupt();
	}
	
	public void run() {
		청소하기();
		음료만들기();
		인사하기();
		주문받기();
		
		//3초 뒤 카운터() 실행
		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		카운터();
	}
	
	public static void main(String[] args) {
		Cafe cafe = new Cafe();
		cafe.run();
	}

}
