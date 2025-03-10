package day16.practice;

public class 나이예외사용하기_runtimeException {

	public static void main(String[] args) {
	
		Age a = new Age();
		
		int result = a.age(100);
		System.out.println(result);
		
		int result2 = a.age(200);
		System.out.println(result2);
		
		System.out.println("프로그램종료");

	}

}
