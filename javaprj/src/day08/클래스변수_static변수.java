package day08;

public class 클래스변수_static변수 {

	//클래스변수 (static 변수)
	//클래스내의 모든 매서드가 공유하는 변수
	//클래스변수의 작성위치는 클래스안에 만들어야 한다
	//프로그램 시작 ~ 종료까지 유지된다
	
	static int index=0; //index 변수를 모든 매서드 공유함 (static영역, 매서드영역);
	//함수안에 만들면안됨
	
	
	public static void main(String[] args) {
		
		System.out.println(index);
		수증가하기();
		System.out.println(index);
		수증가하기();
		System.out.println(index);
		
	}

	
	public static void 수증가하기() {
		index = index+1;  //index++;
	}
}
