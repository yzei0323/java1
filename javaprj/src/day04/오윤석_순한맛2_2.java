package day04;

public class 오윤석_순한맛2_2 {

	public static void main(String[] args) {
		
		// 1   2      3        4          5           100
		// 1 (1+2) (1+2+3) (1+2+3+4) (1+2+3+4+5)..... 100
		// 1   3      6        10         15
		

		int sum=0;
		
		
		for(int i=1; i<=5; i++) {
			for(int k=1; k<=i; k++) {
				sum = sum + k;
			}
		}
		System.out.println(sum);
	}

}
