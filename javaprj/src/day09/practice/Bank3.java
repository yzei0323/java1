package day09.practice;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank3 {

	DecimalFormat format = new DecimalFormat("#,###");
	Scanner sc = new Scanner(System.in);
	String ownerName; //예금주명
	int money;	 	//입금금액
	int pwd;	 	//비밀번호
	int account = 0 ; //계좌
	double savingAccount = 0; //적금계좌
	int menu;
	
	
	
	
	//메뉴메서드
	public void 메뉴(String ownerName) {
		loop:while(true) {
			this.ownerName = ownerName;
			System.out.println("안녕하세요 "+ownerName+"님^^");
			System.out.println("원하시는 메뉴를 선택하세요.");
			System.out.println("1.입금   2.출금   3.조회   4.적금   5.종료");
			menu = sc.nextInt();
			switch(menu) {
			
			case 1:
				입금();
				break;
			case 2:
				출금();
				break;
			case 3:
				조회();
				break;
			case 4:
				적금();
				break;
			case 5:
				System.out.println("종료합니다");
				System.out.println("");
				break loop;
			default:
				System.out.println("잘못 선택하셨습니다.");
				System.out.println("");
			}
		}
		
	}
	
	
	//입금메서드
	public void 입금() {
		if(인증()) {
			System.out.println("입금하실 금액을 입력하세요.");
			money = sc.nextInt();
			if(money >= 0) {
				account += money;
				조회();
			}else {
				System.out.println("0원 이상 입력하세요.");
			}
		}
	}
	
	
	//출금메서드
	public void 출금() {
		if(인증()) {
			System.out.println("출금하실 금액을 입력하세요.");
			money = sc.nextInt();
			if(money<=account && money>=0) {
				account -= money;
				조회();
			}else {
				System.out.println("현재 계좌에 있는 금액보다 많습니다.");
			}
		}
	}
	
	//조회메서드
	public void 조회() {
		System.out.println(ownerName+"님의 현재 계좌잔액은 "+format.format(account)+"원입니다.");
		System.out.println("");
	}
	
	public void 적금조회() {
		System.out.println(ownerName+"님의 적금금액은 "+format.format((int)savingAccount)+"원입니다.");
		System.out.println("");
	}
	
	
	//인증메서드
	public boolean 인증() {
		System.out.println("비밀번호를 입력하세요.");
		pwd = sc.nextInt();
		
		if(this.pwd==1234) {
			System.out.println("인증성공!");
			return true;
		}else {
			System.out.println("인증실패!");
			System.out.println("");
			return false;
		}
	}
	
	
	
	//적금메서드
	public void 적금() {
		System.out.println("적금계좌에 넣을 금액을 입력하세요");
		money = sc.nextInt();
		if(money<=account && money>=0) {
			account -= money;
			savingAccount += money;
			System.out.println("적금 계좌에 "+money+"원이 입금되었습니다.");
			적금조회();
		}else {
			System.out.println("현재 계좌에 있는 금액보다 많습니다.");
			System.out.println("");
		}
		if(savingAccount>=100000) {
			savingAccount*=(1.02);
			System.out.println("이자 2% 입금되었습니다");
			적금조회();
		}
		
	}
}
