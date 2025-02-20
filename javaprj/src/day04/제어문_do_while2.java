package day04;

import java.util.Scanner;

public class 제어문_do_while2 {

	public static void main(String[] args) {
		
		
		//올바른 국어점수가 입력되게 반복하기 
		/*
		 
		 do{
		 
		 
		 
		 }while( 조건 ) ; 
		   
		 */
		
		
		int math;
		Scanner sc = new Scanner( System.in);
		do {
			
			math= sc.nextInt();
			if( math <0  || math >100 ) {
				System.out.println("올바른 점수 입력");
			}
			
		}while( math <0  || math >100);
		
		
		System.out.println("수학점수" + math);
		
	}

}
