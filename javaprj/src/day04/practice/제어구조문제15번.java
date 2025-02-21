package day04.practice;

public class 제어구조문제15번 {

	public static void main(String[] args) {
		
		
		// 15. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 작성하시오
		
		/*
		  	3단
		  	3*1=3
		  	3*2=6
		  	3*3=9
		  	4단
		  	4*1=4
		  	4*2=4
		  	4*3=12
		  	4*4=16
		*/
		
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=i; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
		}
		

	}

}
