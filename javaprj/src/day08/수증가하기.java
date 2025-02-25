package day08;

public class 수증가하기 {

	public static void main(String[] args) {
		
		
		int index=0; //지역변수 (main에서만 사용가능함)
		
		index++;
		System.out.println(index);
		
		index++;
		System.out.println(index);
		
		index =  수증가하기(index);
		System.out.println(index);
	}

	
	//
	public static int 수증가하기(int index) {  // index 매개변수(지역변수) 
										   // : 수증가하기에서 만들어지는 변수이다!!
		index++;
		System.out.println(index);
		
		return index;
	}
}
