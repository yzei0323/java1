package day07.practice;

import java.util.Scanner;

public class 함수기본문제1번 {

	public static void main(String[] args) {
		
		// 1. substract 함수만들어 두 수를 매개변수로 받아 큰 수에서 작은 수를 뺀 결과를 반환하는 함수를 만들기
		
		//함수
		//입력 O
		//반환 O

		substract(2,7);
		substract(5,5);
		substract(8,1);
		substract(-4,10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력");
		int a = sc.nextInt();
		System.out.println("두번째 숫자 입력");
		int b = sc.nextInt();
		substract(a,b);
	}
	
	public static int substract(int a, int b) {
		int result=0;
		if(a>=b) {
			result = a-b;
		}else if(a<b) {
			result = b-a;
		}
		
		System.out.println(result);
		
		return result;
	}
}
