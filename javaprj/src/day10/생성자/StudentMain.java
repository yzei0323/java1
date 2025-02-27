package day10.생성자;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Student s = new Student(); 
		s.input("홍길동", 25);
		s.printInfo();
		
		s.input("홍길동", 100);
		s.printInfo();
		
		//s.name="홍길동님"; //private 안쓰면 name값 바뀜 근데? private붙이잔아?? 그럼 평생 홍길동;;
		s.printInfo();
	}

}
