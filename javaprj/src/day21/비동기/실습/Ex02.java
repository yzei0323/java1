package day21.비동기.실습;

class   A  extends Thread{
	
	//스레드 상속받아서 run 매서드 재정의해야함  (별도의 흐름에서 작업할 내용작성)
	@Override
	public void run() {
		for( int i=1; i<=100; i++) {
			System.out.println("하이");
		}		
		
	}
	
}



//
class B extends Thread{
	
	  //run 매서드 재정의
	@Override
	public void run() {
		for( int i=1; i<=100; i++) {
			System.out.println("바이");
		}
		 
	}
}






public class Ex02 {

	public static void main(String[] args) {
		
		//별도의 흐름 쓰레드로 만들기
		//1.스레드를 상속받아서 만들기
		/*
		for( int i=1; i<=100; i++) {
			System.out.println("하이");
		}
		*/
		
		//별도의 흐름 쓰레드로 만들기 
		/*
		for( int i=1; i<=100; i++) {
			System.out.println("바이");
		}
		*/
		
		
		//쓰레드 객체 생성
		A  a  = new A();
		B  b  = new B();
		
		//쓰레드 실행하기
		a.start();
		b.start();
		
	}

}
