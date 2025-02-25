package test;

import day08.PSK;

public class 라이브러리사용하기 {

	public static void main(String[] args) {
		
		
		//화폐매수 구하기
		//수경님 라이브러리 사용해보기
		//1. 다운로드
		//2. 등록
		
		String name = "박수경";
		int fee = 456125;
		
		int[] result = PSK.work2(name, fee);
		
		for(int i=0; i<result.length; i++) {
			System.out.println(result[i]);
		}

	}

}
