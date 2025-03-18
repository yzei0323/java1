package day21.비동기.실습;

/*
interface Runnable{
	void run();
	
}
*/

public class Ex03 {

	public static void main(String[] args) {

		//별도의 흐름으로 만들기(멀티스레드)
		
		//2. Runnable 인터페이스를 구현하는 방법
		
		/*
		for( int i=1; i<=100; i++) {
			System.out.println("하이");
		}
		*/
		
		/*
		for( int i=1; i<=100; i++) {
			System.out.println("바이");
		}
		*/
		
		
		//				Thread()
		//				Thread(Runnable r)
		Thread th = new Thread(new C());
		Thread th2 = new Thread(new C()); 
		
	}
}

class C implements Runnable{
	
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("하이");
		}
	}
}

class D implements Runnable{
	@Override
	public void run() {
		for(int i=1; i<=100; i++) {
			System.out.println("바이");
		}
	}
}








