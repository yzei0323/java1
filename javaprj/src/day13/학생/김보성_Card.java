package day13.학생;

public class 김보성_Card extends 김보성_Payment {

	@Override
	public void pay(int Payment) {
		System.out.println( "신용카드로 "+Payment+"원 결제하셨습니다.");
	}
	
}
