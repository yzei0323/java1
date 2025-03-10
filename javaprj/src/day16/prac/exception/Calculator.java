package day16.prac.exception;

public class Calculator {

	
	//음수는 덧셈을 하지 않겠다
	//음수값이면 음수예외를 일으키는 코드를 작성하자
	
	//예외 -> checked ( add 매서드를 사용하는 사람이 예외처리를 반드시 하고 사용할 수 있도록 할 수 있다 )
	//	  -> unchecked 
	
	
	public int add(int su1, int su2) throws 음수예외 {
		
		//음수이면 예외가 발생하도록 하자
		if(su1<0 || su2<0) {
			// throw: 예외를 일으키는 코드
			throw new 음수예외("음수는 계산할 수 없습니다.");
		}
		return su1+su2;
	}
	
	// -> unchecked
	//음수예외를 unchecked Exception으로 만들어서 예외를 발생시켜보자
	public int add2(int su1, int su2) {
		
		if(su1<0||su2<0) {
			throw new 음수예외2("음수예외 발생, 음수안됨!!");
		}
		return su1+su2;
	}
}
