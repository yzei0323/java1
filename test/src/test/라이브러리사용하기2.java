package test;

import com.acorn.hyj.HYJ;
import com.acorn.hyj.WJY;

public class 라이브러리사용하기2 {

	public static void main(String[] args) {
		
		int result = WJY.substract(5, 3);
		int result2 = WJY.adder(9, 4);

		
		System.out.println(result);
		System.out.println(result2);
		
		int result3 = HYJ.약수개수(7);
		System.out.println(result3);
	}

}
