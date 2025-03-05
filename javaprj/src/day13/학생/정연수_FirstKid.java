package day13.학생;

public class 정연수_FirstKid extends 정연수_Parent{
	int age;
	public 정연수_FirstKid(String name, String info, int age) {
		super(name, info);
		this.age = age;
	}
	
	public String toString() {
		return name + " " + info + " " + age;
	}

	@Override
	public void action() {
		System.out.println("첫쨰");
	}
	
	public void firstAc() {
		System.out.println("날다");
	}
}
