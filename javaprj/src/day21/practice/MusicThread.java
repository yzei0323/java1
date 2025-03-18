package day21.practice;

public class MusicThread extends Thread {
	@Override
	public void run() {
		
		while(!isInterrupted()) {
			System.out.println("음악듣기");
			for(int i=1; i<=100; i++);
		}
	}
}
