package day08;

public class 배열입력및출력하기 {

	public static void main(String[] args) {
		
		//배열선언 및 할당과 초기화
		//int[] arr = new int[] {10,8,11};
		
		//배열선언
		int[] arr;
		//배열할당   new가 메모리할당을 합니다
		arr = new int[3];
		
		//arr는 참조형변수이다
		//int형 3개를 가지는 배열의 주소를 저장하는 참조형변수이다
		//참조형변수는 주소를 저장하는 변수를 말한다
		
		
		int[] kors = {100,95,95};
		배열출력하기(kors);
		배열출력하기2(kors);
		
		배열입력하기(kors);
		배열출력하기2(kors);
	}

	public static void 배열출력하기(int[] kors) {
		for(int i=0; i<kors.length; i++) {
			System.out.println(kors[i]);
		}
	}

	//배열출력하기
	
	//기능: 배열요소 출력하기
	//입력: 정수형 배열
	//반환: 없다
	
	public static void 배열출력하기2(int[] aa) {  // aa 매개변수 => 참조형변수이다
		for(int i=0; i<aa.length; i++) {
			System.out.println(aa[i]);
		}
	}
	
	
	//배열의 내용 입력하기
	public static void 배열입력하기(int[] bb) {
		bb[0]=44;
		bb[1]=55;
		bb[2]=66;
	}
}
