package day03;

public class 연산자_증감연산자 {

	public static void main(String[] args) {
		
		
		// ++a, b++
		// 공통점 : 변수의 값을 1 증가시킴
		// 다른점: 연산의 결과가 다르다 (++a => 증가된 후의 값을 반환)
		// 						(b++ => 증가되기 전의 값을 반환)
		
		
		
		int a=10;
		int b=10;
		
		int result = ++a;
		int result2 = b++;
		
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("result="+result);
		System.out.println("result2="+result2);
		
		
		
		//문제
		int x=10, y=9, z=8;
		int result3;
		
		x++; 	//11
		--y;	//8
		z++;	//9 
		
		result3 = --x + y++ + --z ; 	// 10 + 8 + 8
		System.out.println(result3);
	}

}
