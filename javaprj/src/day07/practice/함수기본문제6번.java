package day07.practice;

public class 함수기본문제6번 {

	public static void main(String[] args) {

		// 6. 응원의 메시지를 반환하는 함수 만들기
		
		String[] fighting = 응원();
		
		for(String result : fighting ) {
			System.out.println(result);	
		}

		//함수
		//입력 X
		//반환 O
	
	}

	public static String[] 응원() {
		String[] fighting = {"아자아자 화이팅","힘내세요","네시간뒤 집에감","커피 한잔 하세요","이걸응원이라고하는거냐"};
		
		return fighting;
	}
	
}
