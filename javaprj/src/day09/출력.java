package day09;

public class 출력 {

	public static void main(String[] args) {
		data k = new data();
		
		//입력하기
		/*k.a = "ㅇㅇ";
		k.b = 21432;
		k.c = 4253;
		
		*/
		입력하기(k);

		//데이터 출력하기 
		//System.out.println(k.a+","+k.b+","+k.c);
		출력하기(k);
		
	}
	
	
	
	public static void 입력하기( data k) {
		
		//k.a = "ㅇㅇ";
		k.name = "ㅇㅇ";
		k.b = 21432;
		k.c = 4253;
		//추가된 d속성 값을 입력하는 코드 추가
		k.d = 53422;
	}
	
	
	public static void  출력하기(data k) {
		//추가된 속성 d도 출력될 수 있도록 코드를 수정해야 한다
		System.out.println(k.name+","+k.b+","+k.c+","+k.d);
	}
	
	
	

}
