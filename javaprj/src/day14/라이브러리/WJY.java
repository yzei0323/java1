package day14.라이브러리;

public class WJY implements MyRun {
	
	@Override
	public void run() {
		
		System.out.println("2단");
		
		for(int i=1; i<=9; i++) {
			System.out.println("2*"+i+"="+2*i);
		}
	}
	
}
