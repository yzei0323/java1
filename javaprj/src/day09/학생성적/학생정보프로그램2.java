package day09.학생성적;

public class 학생정보프로그램2 {

	public static void main(String[] args) {
		
		
		Student s = new Student();  // Student type의 변수가 만들어짐

		//학생정보 입력
		input(s);
		
		//학생정보 처리
		calc(s);
		
		//학생정보 출력
		printInfo(s);
	}
	
	
	public static void input(Student s) {
		s.name = "이동우";
		s.kor = 100;
		s.eng = 99;
	}
	
	
	public static void calc(Student s) {
		s.total = s.kor + s.eng;
	}
	
	
	public static void printInfo(Student s) {
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.total);
	}
}
