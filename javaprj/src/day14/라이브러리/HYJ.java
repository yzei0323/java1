package day14.라이브러리;

import java.util.Scanner;

public class HYJ implements MyRun{

	String input;
	
	/*
	public HYJ() {
		System.out.println("출력하고 싶은 내용을 적어주세요");
		Scanner sc = new Scanner(System.in);
		input = sc.next();
	}*/
	
	public HYJ(String input) {
		this.input = input;
	}
	
	@Override
	public void run() {
		System.out.println(input);
	}

	
}
