package day12.학생;

public class Fruit1_박수경 extends Fruit_박수경{		//자식
	public String color;
	
	public Fruit1_박수경(String name, int price, String color) {
		super(name, price);		//상속받은거 접근할때 super
		this.color=color;
	}
	public void print자식() {
		System.out.println(color);
		//System.out.println(name+price);
		
		printInfo();
	}
	
}
