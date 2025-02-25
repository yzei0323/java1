package com.acorn.hyj;

import java.util.Scanner;

public class HYJ {


	//약수개수 구하는 기능
	//입력(매개변수)
	//반환 O

	public static int 약수개수(int num) {
		int cnt=0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				cnt++;
			}
		}
		return cnt;
	}
	
	
	
	//약수 구하는 기능
	//입력(매개변수)
	//반환 
	public static int[] 약수(int num) {
		int[] factors = new int[num];
		int index=0;
		for(int i=1; i<=factors.length; i++) {
			if(num%i==0) {
				factors[index]=i;
				index++;
			}

		}
		
		return factors;
		
	}
	
}
