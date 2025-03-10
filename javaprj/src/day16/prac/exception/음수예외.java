package day16.prac.exception;


//Exception을 상속받으면 => checked Exception  (!! 이거를 해볼겁니다) 

//RuntiomException을 상속받으면 => unchecked Exception

public class 음수예외 extends Exception {
	
	
	//생성자
	public 음수예외() {
		
	}
	
	//매개변수 있는 생성자
	public 음수예외(String message) {
		super(message);
	}
}
