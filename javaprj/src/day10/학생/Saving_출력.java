package day10.학생;


public class Saving_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Saving s = new Saving();
//		Saving newSaving = new Saving();
		
		//기본정보
		s.openAcount();
		s.outPut();
		
		//적금할 금액 입력
		s.count();
		s.outPut();
		
		//추가 적금 금액 입력
		s.addAcount();
		
		//계좌 정보출력
		s.outPut();
		
	}

	
}
