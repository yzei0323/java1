package day13.학생;

public class 정연수_ThirdKids extends 정연수_Parent{
	int age;
	
	public 정연수_ThirdKids(String name, String info, int age) {
		super(name, info);
		this.age = age;
	}
	
	public String toString() {
		return name + " " + info + " " + age;
	}

	@Override
	public void action() {
		System.out.println("셋째");
	}
	
	public void thirdAction() {
		System.out.println("뛰다");
	}
}
