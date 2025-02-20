package day03;

public class 연산자_논리연산자 {

	public static void main(String[] args) {
		
		
		// 논리연산자 && (그리고) => 모두 만족해야 함
		//		   || (이거나) => 한 개만 만족해도 됨
		//			! (부정)  => 참 =>거짓, 거짓=>참
		
		int kor=80;
		int eng=90;
		
		
		//장학금지급
		boolean result = (kor>=90) && (eng>=90);  // false
		System.out.println(result==true?"장학금 지급":"장학금 미지급");
		
		boolean result2 = (kor>=90) || (eng>=90); //true
		System.out.println(result2==true?"장학금 지급":"장학금 미지급");
		
		boolean result3 = kor>=90;	  //false
		boolean result4 = !(kor>=90); //true
		
		System.out.println(result3);
		System.out.println(result4);
	}

}
