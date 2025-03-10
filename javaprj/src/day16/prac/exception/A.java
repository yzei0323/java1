package day16.prac.exception;

public class A {
	
	public void 놀기() {
		System.out.println("놀기");
	}

	@Override
	public String toString() {
		String str = super.toString();
		return "A객체정보" + str;
	}
	
}

//A클래스 -> A객체( String toString() - 부모한테물려받은거, String toString() - 재정의 한 거 )
//매서드의 이름이 동일한 경우 부모의 매서드를 사용하기 위해서 super키워드 사용
