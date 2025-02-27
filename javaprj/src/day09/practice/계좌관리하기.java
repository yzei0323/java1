package day09.practice;

import java.util.Scanner;

public class 계좌관리하기 {

	public static void main(String[] args) {
		
		Bank3 bank1 = new Bank3();
		
		loop:while(true) {
			bank1.메뉴("황예지");
			switch(bank1.menu) {
			
			case 1:
				bank1.입금();
				break;
			case 2:
				bank1.출금();
				break;
			case 3:
				bank1.조회();
				break;
			case 4:
				bank1.적금();
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

		
		Bank3 bank2 = new Bank3();
		
		loop:while(true) {
			bank2.메뉴("이수민");
			switch(bank2.menu) {
			
			case 1:
				bank2.입금();
				break;
			case 2:
				bank2.출금();
				break;
			case 3:
				bank2.조회();
				break;
			case 4:
				bank2.적금();
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
		
		Bank3 bank3 = new Bank3();
		
		loop:while(true) {
			bank3.메뉴("박수경");
			switch(bank3.menu) {
			
			case 1:
				bank3.입금();
				break;
			case 2:
				bank3.출금();
				break;
			case 3:
				bank3.조회();
				break;
			case 4:
				bank3.적금();
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
		
		Bank3[] list = {bank1,bank2,bank3};
		for(int i=0; i<list.length; i++) {
			list[i].조회();
			list[i].적금조회();
		}
	}

}
