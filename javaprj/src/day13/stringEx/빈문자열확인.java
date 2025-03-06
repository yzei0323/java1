package day13.stringEx;

public class 빈문자열확인 {

	public static void main(String[] args) {
		
		String str="";
		String str2=" ";

		
		boolean result = str.isEmpty();		//true
		boolean result2 = str2.isEmpty();	//false 띄어쓰기도 뭐가 있다고 인식이 됨요
		
		
		boolean result3 = str.isBlank();	//true
		
		
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
		
		
	}

}
