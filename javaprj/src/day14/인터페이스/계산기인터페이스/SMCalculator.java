package day14.인터페이스.계산기인터페이스;

public class SMCalculator implements Calculator{

	@Override
	public int add(int su1, int su2) {
		System.out.println("sm add");
		return su1+su2;
	}
	
	public int sub(int su1, int su2) {
		System.out.println("sm sub");
		return su1-su2;
	}
}
