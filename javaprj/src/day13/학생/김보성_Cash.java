package day13.학생;

public class 김보성_Cash extends 김보성_Payment{

	@Override
	public void pay(int Payment) {
		System.out.println( "현금으로 "+Payment+"원 결제하셨습니다.");
	}
	
}
