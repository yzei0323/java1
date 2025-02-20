package day03;

public class 연산자_비교연산자 {

	public static void main(String[] args) {
		
		
		// >, <, >=, <= , ==, !=
		
		//연산의 결과 true, false 발생된다
		int su1=10;
		int su2=5;
		
		boolean result;
		
		System.out.println(su1>su2);  //true
		System.out.println(su1<su2);  //false
		System.out.println(su1==su2); //false
		System.out.println(su1<=su2); //false
		System.out.println(su1>=su2); //true
		System.out.println(su1!=su2); //true
		
		result = su1>su2;	//
		System.out.println(result);
	}

}
