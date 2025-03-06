package day14.라이브러리;

public class Main {

	public static void main(String[] args) {
	
		
		MyLib1 lib = new MyLib1();
		lib.printStar();
		lib.printChar('$');
		
		lib.세번실행하기(new WJY());
		
		
		lib.세번실행하기(new MyRun() {
			
			@Override
			public void run() {
				System.out.println("3단");
				
				for(int i=1; i<=9; i++) {
					System.out.println("3*"+i+"="+3*i);
				}
			}
		});
		
		
		lib.세번실행하기(new HYJ("집에가고싶다"));
	}

}
