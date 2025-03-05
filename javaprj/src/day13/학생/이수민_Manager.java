package day13.학생;

public class 이수민_Manager extends 이수민_Employee {
	
	int bonus = 1000000;
	
	public 이수민_Manager(String name, int time, int rate) {
		super(name, time, rate);
	}
	
	@Override
	public int calcSalary() {
		
		salary = time*rate;
		this.salary = salary+bonus;
		return this.salary;
	}
	
	
}
