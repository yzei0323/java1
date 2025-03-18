package day21.데몬.실습;

public class Ex01 {

	public static void main(String[] args) {
		
		/*
		MyDaemon d = new MyDaemon();
		d.start();
		*/
		
		//데몬스레드로 만들기
		MyDaemon d = new MyDaemon();
		d.setDaemon(true); //데몬스레드로 설정(데몬스레드가 됨)
		d.start();
		
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("프로그램 종료");
	}

}

class MyDaemon extends Thread{
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
		}
	}
}