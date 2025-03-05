package day13.학생;

public class 이동우_Propessor extends 이동우_Person{

	public 이동우_Propessor(String name) {
		super(name);
	}
	
	@Override
	public void personInfo() {
		
		System.out.println(name + "의 역할은 학생들을 가르치는 일이다.");
	}
}
