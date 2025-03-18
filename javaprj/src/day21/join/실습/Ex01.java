package day21.join.실습;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Counter th = new Counter();
		th.start();
		
		//시간끌기
		//작업 수행 흉내
		
		try {
			Thread.sleep(3000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		try {
			th.join();	//th스레드 작업이 끝날 때까지 기다리기
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 프로그램 종료");
	}

}
