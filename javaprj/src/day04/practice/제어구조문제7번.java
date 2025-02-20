package day04.practice;

import java.util.Scanner;

public class 제어구조문제7번 {

	public static void main(String[] args) {
		
		// 7. 수를 입력받아서 짝수의 합을 구하세요 (10개의 수를 입력)
		
		int input;
		int sum=0;
		int n=1;
		
		Scanner sc = new Scanner(System.in); 

		for(n=1; n<=10; n++) {
			input=sc.nextInt();
			if(input%2==0) {
				sum+=input;
			}
		}
		System.out.println("입력하신 숫자 중 짝수의 합은 "+sum+" 입니다");
	}

}
