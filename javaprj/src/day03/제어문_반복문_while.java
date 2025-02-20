package day03;

import java.util.Scanner;

public class 제어문_반복문_while {

	public static void main(String[] args) {
		
		//while => 반복횟수가 정해져 있지 않고 특정조건일 때까지 반복할 때 사용

		
		//1~10까지의 합
		//특정조건으로 반복할 때
		
		
		//0 입력되면 반복이 종료되도록 하겠다
		//0이 입력될 때까지 수를 더하시오
		
		//입력: 입력되는 수 input
		//출력: 수의 합계: sum
		
		
		int input;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			
			input = sc.nextInt();
			
			if(input == 0) break;	//자신이 속한 반복문 빠져나감
			sum = sum+input; 	// sum += input;
			
			//종료조건 명시
		}
		System.out.println(sum);
	}

}
