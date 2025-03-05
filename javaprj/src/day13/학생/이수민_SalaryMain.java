package day13.학생;

public class 이수민_SalaryMain {

	public static void main(String[] args) {
		
		이수민_Employee e = new 이수민_Employee("홍길동", 8, 10000);
		이수민_Manager m = new 이수민_Manager("홍길순", 8, 15000);
		
		System.out.println(e.toString());
		System.out.println(m.toString());
		
	}

}
