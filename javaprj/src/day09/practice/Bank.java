package day09.practice;

import java.util.Scanner;

public class Bank {

	Scanner sc = new Scanner(System.in);
	String ownerName; //예금주명
	int money;	 	//입금금액
	int pwd;	 	//비밀번호
	int account = 0 ; //계좌
	
	public void 입금(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("안녕하세요 "+this.ownerName+"님");
		
		인증();
		
		System.out.println("입금하실 금액을 입력하세요");
		money = sc.nextInt();
		if(money>=0) {
			account += money;
			System.out.println(this.ownerName+"님의 현재 잔액은 "+this.account+"원입니다");
			System.out.println("");
		}else {
			System.out.println("0원 이상 입력하세요");
		}
		
	}
	
	
	public void 조회(String ownerName) {
		this.ownerName = ownerName;
		System.out.println(this.ownerName+"님의 현재 잔액은 "+this.account+"원입니다");
		System.out.println("");
	}
	
	public void 인증() {
		System.out.println("비밀번호를 입력하세요");
		this.pwd = sc.nextInt();
		
		if(this.pwd==1234) {
			System.out.println("인증성공!");
		}else {
			System.out.println("인증실패! 비밀번호가 틀렸습니다");
			System.out.println("");
		}
	}
}
