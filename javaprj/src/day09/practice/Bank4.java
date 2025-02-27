package day09.practice;

import java.util.Scanner;

public class Bank4 {
	Scanner sc = new Scanner(System.in);
	String ownerName;
	int money;
	int pwd;
	int account;

	// 입금 메서드
	public void 입금(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("안녕하세요 "+ownerName+"님");
		System.out.println("비밀번호를 입력하세요");
		pwd = sc.nextInt();
		
		if(pwd==1234) {
			System.out.println("인증성공!");
			System.out.println("입금하실 금액을 입력하세요");
			money = sc.nextInt();
			account += money;
			System.out.println(this.ownerName+"님의 현재 잔액은 "+this.account+"원입니다");
		} else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

	// 출금 메서드
	public void 출금(String ownerName) {
		this.ownerName = ownerName;
		System.out.println("안녕하세요 "+ownerName+"님");
		System.out.println("비밀번호를 입력하세요");
		pwd = sc.nextInt();
		
		if(pwd==1234) {
			System.out.println("인증성공!");
			System.out.println("출금하실 금액을 입력하세요");
			money = sc.nextInt();
			
			if(account >= money) {
				account -= money;
				System.out.println(money + "원이 출금되었습니다.");
				System.out.println(this.ownerName+"님의 현재 잔액은 "+this.account+"원입니다");
			} else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 잔액: " + account + "원");
			}
		}else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

	// 송금 메서드 추가
	//Bank receiver 매개변수는 Bank 클래스의 인스턴스(객체)를 받아옴.
	public void 송금(String ownerName, Bank4 receiver) {

		this.ownerName = ownerName;
		System.out.println("안녕하세요 "+ownerName+"님");
		System.out.println("비밀번호를 입력하세요");
		pwd = sc.nextInt();
		
		if(pwd==1234) {
			System.out.println("인증성공!");
			System.out.println("송금하실 금액을 입력하세요");
			money = sc.nextInt();
			
			if(account >= money) { // 계좌에 있는 금액이 money보다 같거나 클 경우
				account -= money;  // 보내는 사람 계좌에서 차감
				receiver.account += money;  // 받는 사람 계좌에 추가
				System.out.println(money + "원이 " + receiver.ownerName + "님께 송금되었습니다.");
				System.out.println(this.ownerName+"님의 현재 잔액은 "+this.account+"원입니다");
			} else {
				System.out.println("잔액이 부족합니다.");
				System.out.println("현재 잔액: " + account + "원");
			}
		}else {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}
}
