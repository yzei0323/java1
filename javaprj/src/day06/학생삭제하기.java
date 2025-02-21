package day06;

import java.util.Scanner;

public class 학생삭제하기 {

	public static void main(String[] args) {
		
		
		//학생정보 (학생이름) 삭제하기
		Scanner sc = new Scanner(System.in);
		String[] names  = new String[5];
		 
		names[0]="정연수";
		names[1]="최지태";
		names[2]="김보성";
		names[3]="황예지";
		names[4]="최하은";
		
		
		//학생조회
		for(int i=0; i<names.length; i++) {
			System.out.println((i+1)+" "+names[i]);
		}
		
		//삭제할 학생번호 입력 받는다
		System.out.println("삭제하려는 학생번호를 입력하세요.");
		int deleteNo = sc.nextInt();
		
		//배열에서 삭제한다
		names[deleteNo-1]="0"; //삭제된 요소를 의미함
		
		//1. 배열의 요소에 0을 입력한다 (0=> 삭제된 학생이다)
		//2. 오른쪽 요소를 왼쪽요소로 저장하기

		
		//조회하기 (0이 된 것은 조회되지 않도록 하기 )
		for(int i=0; i<names.length; i++) {
			if(names[i].equals("0")) {
				System.out.println(names[i]);
			}
		}
	
	}

}
