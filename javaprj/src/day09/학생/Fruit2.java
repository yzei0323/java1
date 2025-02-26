package day09.학생;



public class Fruit2 {

	String name;
	String flavor;
	
	public void fruit() {
		this.flavor = "사과맛";
		this.name = "사과";
	}
	
	public void printFruit() {
		String[] fruit = new String[2];
		fruit[0] = this.name;
		fruit[1] = this.flavor;
		for(int i=0; i<fruit.length; i++) {
			System.out.println(fruit[i]);
		}
	}
}
