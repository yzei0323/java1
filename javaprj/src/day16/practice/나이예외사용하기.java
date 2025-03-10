package day16.practice;

public class 나이예외사용하기 {

	public static void main(String[] args) {
		
		
		int su = 160;
		
		
		Age a = new Age();
		int result=0;
		try {
			result = a.age2(su);
		}catch (나이예외 e) {
			e.printStackTrace();
		}

		System.out.println(result);
	}
}
