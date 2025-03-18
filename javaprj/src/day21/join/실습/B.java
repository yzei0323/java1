package day21.join.실습;

public class B extends Thread{

	private int sum;
	
	public int getSum() {
		return sum;
	}
	
	@Override
	//51-100까지의 합
	public void run() {
		for(int i=51; i<=100; i++){
			sum = sum + i;
			//System.out.println(getName() + "=" + sum);
		}
	}
}
