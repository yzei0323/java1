package day14.인터페이스.계산기인터페이스;

public class GSCalculator implements Calculator {
	
	
	@Override
	public int add(int su1, int su2) {
		System.out.println("gs add");
		return su1+su2;
	}
	
	public int sub(int su1, int su2) {
		System.out.println("gs sub");
		return su1-su2;
	}
	
	public int mul(int su1, int su2) {
		System.out.println("gs mul");
		return su1*su2;
	}
	
	public int div(int su1, int su2) {
		System.out.println("gs div");
		return su1/su2;
	}
	
}
