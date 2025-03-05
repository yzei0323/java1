package day13.학생;

public class 이동우_Student extends 이동우_Person{

	public 이동우_Student(String name) {
		super(name);
	}
	
	@Override
	public void personInfo() {
		System.out.println(name + "의 역할은 열심히 공부하는 일이다.");
	}
}
