package day13.학생;

public class 정연수_SecondKids extends 정연수_Parent{
	int age;
	public 정연수_SecondKids(String name, String info, int age) {
		super(name, info);
		this.age = age;
	}
	
	public String toString() {
		return name + " " + info + " " + age;
	}

	@Override
	public void action() {
		System.out.println("둘쨰");
	}
	
	public void secAction() {
		System.out.println("구르다");
	}
}
