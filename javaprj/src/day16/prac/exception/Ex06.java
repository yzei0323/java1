package day16.prac.exception;

public class Ex06 {

	public static void main(String[] args) {
		
		
		String str = "100";
		String str2 = "hello";
		
		//숫자형태로 된 문자열 => 실제 숫자로 변환
		//라이브러리가 제공된다
		//int Integer.parseInt(String str);
		
		int result = Integer.parseInt(str);
		System.out.println(result + 10);
		
		try {
			int result2 = Integer.parseInt(str2);
		}catch(NumberFormatException e) {
			//e.printStackTrace();
			System.out.println("숫자로 된 문자열을 입력하세요");
		}
		
		System.out.println("프로그램 종료");
	}

}
