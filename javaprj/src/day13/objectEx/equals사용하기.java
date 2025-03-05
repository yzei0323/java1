package day13.objectEx;

public class equals사용하기 {

	public static void main(String[] args) {
		
		
		Score s = new Score(90, 100);
		//Score s3 = s; 
		
		Score s2 = new Score(90, 100);
		
		
		//두 개 성적 비교하기
		//equals 메서드 사용하여 두 객체 비교하기
		//주소를 비교해서 같으면 true, 아니면 false 
		
		boolean result = s.equals(s2);
		System.out.println(result);

		
		Object o1 = s;
		Object o2 = s2;
		
		if(o1.equals(o2)) {
			System.out.println("두 객체는 같아요");
		}else {
			System.out.println("두 객체는 달라요");
		}
		
	}

}
