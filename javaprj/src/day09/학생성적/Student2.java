package day09.학생성적;

/*
 	학생정보를 처리할 type이 필요해 => type을 만들어서 사용(사용자정의 자료형)
 	
 	학생정보를 처리할 type 설계, 정의하는 것
*/

public class Student2 {

	String name;
	int kor;
	int eng;
	int total;

	
	//public void input(Student2 s)
	//	아래처럼 바뀐다
	//public void input(Student2 this)
	public void input(String name, int kor, int eng) {
		/*
		this.name = "이동우";
		this.kor = 100;
		this.eng = 99;
		*/
		
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	//public void calc(Student2 s) {
	//public void calc(Student2 this) {
	public void calc() {
		this.total = this.kor + this.eng;
	}
	
	
	//public void printInfo(Student2 s) {
	//public void printInfo(Student2 this) {	
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