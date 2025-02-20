package day04;

public class 오윤석_순한맛2 {

	public static void main(String[] args) {
		
		// 1   2      3        4          5           100
		// 1 (1+2) (1+2+3) (1+2+3+4) (1+2+3+4+5)..... 100
		// 1   3      6        10         15
		
		int k;
		int i=1;
		int sum=0;
		
		
		while(i<=100) {
			k=1;
			while(k<=i) {
				sum=sum+k;
				k=k+1;
			}
			i=i+1;
			
		}
		System.out.println(sum);
	}

}
