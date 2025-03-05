package day13.학생;

public class 이수민_Employee {
	
	protected String name;
	protected int time;
	protected int rate;
	
	int salary=0;
	
	public 이수민_Employee() {
		
	}
	public 이수민_Employee(String name, int time, int rate) {
		this.name = name;
		this.time = time;
		this.rate = rate;
	}
	
	public int calcSalary() {
		salary = time*rate;
		return salary;
	}
	
	
	public String toString() {
		calcSalary();
		return name+"님의 급여: "+salary;
	}
	
}
