package com.acorn.hyj;

/*
	라이브러리로 만드는 방법 (수동)
	
	1. 컴파일을 한다 .class 파일이 만들어진다
	2. 클래스파일을 알집으로 압축한다 .zip 파일 생성
	3. 확장자 .zip -> .jar로 바꾼다
	
*/

public class WJY {

	
	//더하기 기능
	//입력(매개변수)
	//반환
	
	public static int adder(int num1, int num2){
		return num1 + num2;
	}
	
	//빼기 기능

	public static int substract(int num1, int num2) {
		int result = num1-num2;
		return result;
	}
}
