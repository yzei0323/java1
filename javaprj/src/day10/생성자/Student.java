package day10.생성자;

public class Student {

	private String name;
	private int age;
	
	
	//input() 메서드는 객체가 생성된 후부터 사용할 수 있다
	//생성된 객체의 주소를 this라는 참조형 변수로 받는다
	//this변수의 type Student타입이다
	// this => 참조형 변수
	public void input(String name, int age) {
		
		this.name = name;
		this.age = age;
		
	}
	
	
	//
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(age);
	}
}
