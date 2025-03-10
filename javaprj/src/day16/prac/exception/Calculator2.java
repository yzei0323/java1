package day16.prac.exception;

public class Calculator2 {


	public int add(int su1, int su2) {
		
		if(su1<0||su2<0) {
			System.out.println("음수는 안됩니다.");
			return -99;	//int 반환의 약속을 지키기 위해서 -99라는 
		}
		
		///
		///
		return su1+su2;
	}
}
