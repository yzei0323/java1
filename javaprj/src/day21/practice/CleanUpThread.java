package day21.practice;

public class CleanUpThread extends Thread {
	@Override
	public void run() {
		while(!isInterrupted()) {
			System.out.println("청소하기");
			for(int i=1; i<=100; i++) ;
		}
	}
}
