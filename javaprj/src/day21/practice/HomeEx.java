package day21.practice;

public class HomeEx {

	
	public static void main(String[] args) {
		ShowerThread st = new ShowerThread();
		CleanUpThread ct = new CleanUpThread();
		DinnerThread dt = new DinnerThread();
		MusicThread mt = new MusicThread();
	
		st.start();
		ct.start();
		dt.start();
		mt.start();
		
	}

}
