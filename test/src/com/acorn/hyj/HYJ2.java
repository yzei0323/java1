package com.acorn.hyj;

public class HYJ2 {

		//약수와 약수개수 구하는 기능
		//입력(매개변수)
		//반환 O

		public static int 약수(int num) {
			int cnt=0;
			for(int i=1; i<=num; i++) {
				if(num%i==0) {
					System.out.print(i+" ");
					cnt++;
				}
			}
			return cnt;
		}
}
