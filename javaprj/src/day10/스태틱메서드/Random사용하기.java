package day10.스태틱메서드;

import java.util.Random;

public class Random사용하기 {

	public static void main(String[] args) {
		
		
		//라이브러리에서
		//메서드앞에 static이 있으면 객체생성없이 사용한다
		int result = Math.min(3,3);
		
		
		double result2 = Math.random();
		System.out.println(result2);
		
		
		//Random클래스의  nextInt(int bound) 사용하기
		Random r = new Random();
		int result3 = r.nextInt(10);
		
		System.out.println(result3);
	
	}

}
