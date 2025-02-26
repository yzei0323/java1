package day09.학생성적;

/*
 	학생정보를 처리할 type이 필요해 => type을 만들어서 사용(사용자정의 자료형)
 	
 	학생정보를 처리할 type 설계, 정의하는 것
 	
 	데이터 + 데이터를 다루는 함수(매서드)
 	
 	캡슐화 : 1. 데이터 + 데이터를 다루는 함수(매서드)
 		   2. 데이터 보호(접근제한자 private, public, protected, default), 특별한 기능(함수,매서드): 생성자가 있음
 		  //생성자 : 객체가 생성될 때 (new 될 때) 단 한번만 호출함
*/

public class Student3 {

	private String name;
	private int kor;
	private int eng;
	private int total;

	/*
	public void input(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	*/

	// 생성자는 항상 호출할 수 있는 기능이 아니다
	// new 될 때 단 한번만 호출된다
	
	//생성자 만드는 규칙 =>
	//1. 반환 type 명시하면 안됨
	//2. 반드시 클래스이름과 동일해야 한다
	//3. 생성자는 만들지 않으면 기본생성자를 제공한다
	
	//기본생성자
	public Student3() {
		
	}
	
	//기본생성자
	public Student3(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void calc() {
		this.total = this.kor + this.eng;
	}
	
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.total);
	}
}

// 데이터 + 매서드
// static 제거함 (static 있으면 => 클래스에 소속된 기능, 매서드이다)
// static 제거된 매서드(함수) => 클래스에 정의된 변수(구조화된 변수)가 만들어지면 사용할 수 있다는 것을 의미함
// static 제거된 변수(객체변수, 인스턴스 변수라고 함) => 변수가 만들어진 후부터 사용하는 것이 의미가 있다
//                 							(변수가 안만들어지면 사용할 수 없다)