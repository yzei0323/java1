package day13.학생;

import java.util.Scanner;

public class 김보성_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		int value;
		
		김보성_Payment card = new 김보성_Card();
		김보성_Payment cash = new 김보성_Cash();
		김보성_Payment rwpoint = new 김보성_Rewardpoint();
		김보성_Payment payment = new 김보성_Payment();
		
		System.out.println("결제 수단을 선택해 주세요  |  1. 신용카드   2. 현금   3. 포인트   4. 결제예정");
		System.out.print("입력 : ");
		choice = sc.nextInt();
		if(choice == 1) {
			System.out.println("신용카드 결제를 선택하셨습니다. \n금액을 입력 해 주세요");
			System.out.print("입력 : ");
			value = sc.nextInt();
			card.pay(value);
			
		}else if(choice == 2) {
			System.out.println("현금 결제를 선택하셨습니다. \n금액을 입력 해 주세요");
			System.out.print("입력 : ");
			value = sc.nextInt();
			cash.pay(value);
			
		}else if(choice == 3) {
			System.out.println("포인트 결제를 선택하셨습니다. \n금액을 입력 해 주세요");
			System.out.print("입력 : ");
			value = sc.nextInt();
			rwpoint.pay(value);
			
		}else if(choice ==4) {
			System.out.println("결제 예정을 선택하셨습니다. \n금액을 입력 해 주세요");
			System.out.print("입력 : ");
			value = sc.nextInt();
			payment.pay(value);
			
		}else {
			System.out.println("잘못된 입력입니다.");
			
		}
		
		
		
		
		
	}

}
