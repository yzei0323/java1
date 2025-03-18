package day21.practice;

public class HomeEx2 {

	DinnerThread dt;
	CleanUpThread ct;
	MusicThread mt;
	ShowerThread st;
	
	public HomeEx2() {
		dt = new DinnerThread();
		ct = new CleanUpThread();
		mt = new MusicThread();
		st = new ShowerThread();
	}
	
	
	public void 잘준비() {
		System.out.println("자려면 씻어야 돼");
		ct.interrupt();	//청소스레드에 신호보내기
		mt.interrupt();	//음악스레드에 신호보내기
		st.start();
	}
	
	//시작점
	public void run() {
		dt.start();
		ct.start();
		mt.start();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		//5초후에
		잘준비();
	}
	
	
	public static void main(String[] args) {
		HomeEx2 h = new HomeEx2();
		h.run();
	}

}
