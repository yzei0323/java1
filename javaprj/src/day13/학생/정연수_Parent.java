package day13.학생;

public class 정연수_Parent {

	String name;
	String info;
	
	public 정연수_Parent() {
		
	}
	
	public 정연수_Parent(String name, String info) {
		this.name = name;
		this.info  = info;
	}
	
	public void action() {
		System.out.println("안녕");
	}
	
	public String toString() {
		return name + info;
	}
}
