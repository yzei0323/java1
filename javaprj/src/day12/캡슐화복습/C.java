package day12.캡슐화복습;

public class C {
	
	private int 변수1;
	private int 변수2;
	
	
	// 생성자
	//값을 저장하는 특별한 방법
	public C() {
		
	}
	
	public C( int 변수1 ,  int 변수2) {
		this.변수1 =변수1;
		this.변수2 = 변수2;
	}
	
	
	// 값을 제공하는 방법 
	public String toString(){
		return 변수1+" " + 변수2;
	}	
	

}
