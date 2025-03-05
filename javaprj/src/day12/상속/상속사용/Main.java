package day12.상속.상속사용;

public class Main {

	public static void main(String[] args) {

		Student s  = new Student();
		
		s.걷기();
		s.공부하기();
		
		StudentWorker sw  = new StudentWorker();
		
		sw.걷기();
		sw.공부하기();	 
		sw.일하기();

	}

}
