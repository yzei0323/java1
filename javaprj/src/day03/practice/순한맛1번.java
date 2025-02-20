package day03.practice;

public class 순한맛1번 {

	public static void main(String[] args) {
		
		//1+3+5+7+9+...+99의 홀수의 합
		
		int n=1;
		int sum=0;
		
		for(n=1; n<=99; n+=2) {
			sum += n;
		}

		System.out.println(sum);
	}

}
