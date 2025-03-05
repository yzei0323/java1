package day13.학생;

public class 김유민_SchoolMain {

	public static void main(String[] args) {
		
		김유민_Class c= new 김유민_Class();
		c.학교();
//		c.교실();
		
		김유민_Student s = new 김유민_Student();
		s.학교();
//		s.공부하기();
		
		//업캐스팅
		김유민_School s1;
		s1 = c;
		
		//다운캐스팅
		김유민_Class cc = (김유민_Class) s1;
//		cc.교실();
		
		
		
		//객체배열
		
		김유민_School s2 = new 김유민_Class();
		김유민_School s3 = new 김유민_Student();
		
		김유민_School list[] = new 김유민_School[2];
		list[0] = s2;
		list[1] = s3;
		
		for (int i=0; i<list.length; i++) {
			list[i].학교();
		}

	}

}
