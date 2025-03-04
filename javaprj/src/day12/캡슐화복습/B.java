package day12.캡슐화복습;


//B라는 타입의 객체를 만들기 위한 틀, 명세
public class B {

	
	//속성 (데이터) => new에 의해서 객체가 됨	B obj = new B();
	int 변수1;
	int 변수2;
	
	
	//메서드	(데이터를 다루는 방법 (메서드))
	
	
	//public void 메서드1( B this ) {
	public void 메서드1() {
		System.out.println("데이터를 다루는 메서드"); 
		System.out.println("데이터 정보가 전달된다");
		System.out.println("this라는 참조형변수가 데이터정보를 저장한다");
	}

	//데이터보호
	//생성자, 접근제한자
	
	
}
