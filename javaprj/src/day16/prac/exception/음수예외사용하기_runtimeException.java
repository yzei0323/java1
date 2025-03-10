package day16.prac.exception;

public class 음수예외사용하기_runtimeException {

	public static void main(String[] args) {
		
		
		Calculator c = new Calculator();
		
		int result = c.add2(3, 5);
		System.out.println(result);
		
		int result2 = c.add2(5, -3);
		System.out.println(result2);
		
		System.out.println("프로그램 종료");

	}

}
