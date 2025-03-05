package day12.캡슐화복습;


//B라는 타입의 객체를 만들기 위한 틀 , 명세 
public class B {
	
	//속성 (데이터)  => new에 의해서 변수가 만들어짐
	              // 객체라고 부른다     B obj = new B( );
	int 변수1;
	int 변수2;
	
	
	//매서드  (데이터를 다루는 방법 (매서드)	
	//public void 매서드1( B  this) {  
	public void 매서드1() {
		System.out.println ("데이터 (객체) 를 다루는 매서드");
		System.out.println ("데이터 정보가 전달된다 ");
		System.out.println ("this라는 참조형변수가 데이터정보를 저장한다 ");
		
		
		System.out.println( this.변수1);
		System.out.println( this.변수2);
	}
	
	
	//데이터보호
	//생성자, 접근제한자 
	
	
	

}
