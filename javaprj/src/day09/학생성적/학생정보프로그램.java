package day09.학생성적;

public class 학생정보프로그램 {

	public static void main(String[] args) {
		
		
		Student s = new Student();  // Student type의 변수가 만들어짐

		
		//학생정보 입력
		s.name = "이동우";
		s.kor = 100;
		s.eng = 99;
			
		
		//학생정보 처리
		s.total = s.kor + s.eng;
	
		
		//학생정보 출력
		System.out.println(s.name);
		System.out.println(s.kor);
		System.out.println(s.eng);
		System.out.println(s.total);
		
		
		s.name = "이동우님";
		s.kor = -100;
	}

}
