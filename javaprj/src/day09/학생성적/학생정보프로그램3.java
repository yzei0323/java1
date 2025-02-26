package day09.학생성적;

public class 학생정보프로그램3 {

	public static void main(String[] args) {
		
		Student2 s = new Student2();    //s는 참조형변수이다
		s.input("이동우",100,99);		// input(s);
		s.calc();		// calc(s);
		s.printInfo();	// printInfo(s);
	
	
		Student2 s2 = new Student2();
		s2.input("권지언",99,100);
		s2.calc();
		s2.printInfo();
		
	
		
		
		// 두 명의 학생정보를 배열로 저장하기
		System.out.println("=======배열로 처리하기");
		Student2[] list = {s, s2};
		
		for(int i=0; i<list.length; i++) {
			list[i].printInfo();
		}
		
		s.input("이동우님", 0, 0);
		s.calc();
		s.printInfo();
	}

}
