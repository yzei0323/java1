package day07.practice;

import java.util.Scanner;

public class 함수기본문제0번 {

	public static void main(String[] args) {
	
		//0. 두 수를 매개변수로 받아 합을 반환하는 함수 만들기

		//함수
		//입력 o
		//반환 o
		
		sum(3, 5);
		sum(4, 6);
		sum(-2, 1);		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자 입력");
		int a = sc.nextInt();
		System.out.println("두번째 숫자 입력");
		int b = sc.nextInt();
		sum(a,b);
	}
	
	public static int sum(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
		
		return sum;
	}

}
