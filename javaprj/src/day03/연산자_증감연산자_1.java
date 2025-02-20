package day03;

public class 연산자_증감연산자_1 {

	public static void main(String[] args) {
		
		
		//1~10까지합
		
		/*
		 int n=0;
		 int sum=0;
		 
		 while(n<=10) {
			 n=n+1;	  // n++;
			 sum = sum + n; // sum+=n;
		 }
		 
		 System.out.println(sum);
		*/
		
		int n=0;
		int sum=0;
		while(n++ <= 10) {
			sum = sum + n;  // sum += n;
			
		}
		
		System.out.println(sum);
		
		
		// 	++n	 n  sum
		//	  1  1   1
		//    2  2   3
		//    3  3   6
		//    4  4   10
		//    5  5   15
	
	
	}

}
