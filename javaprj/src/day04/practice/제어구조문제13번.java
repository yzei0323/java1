package day04.practice;

import java.util.Scanner;

public class 제어구조문제13번 {

	public static void main(String[] args) {
		
		
		// 13. 주문수량, 메뉴를 입력받아 해당 주문의 주문금액을 출력하는 프로그램 작성하시오.
		// 	  (메뉴, 가격 임의로 정하기)

		
		int cnt;
		String menu;
		int price;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아메리카노: 1500원");
		System.out.println("카페라떼: 2900원");
		System.out.println("바닐라라떼: 3400원");
		System.out.println("스무디: 3900원");
		System.out.println("주스: 4000원");
		
		
		System.out.println("메뉴를 입력하세요");
		menu = sc.nextLine();
		System.out.println("주문수량을 입력하세요");
		cnt = sc.nextInt();

		
		switch(menu) {
		
		case "아메리카노":
			price = 1500*cnt;
			System.out.println(price+"원");
			break;
		case "카페라떼":
			price = 2900*cnt;
			System.out.println(price+"원");
			break;
		case "바닐라라떼":
			price = 3400*cnt;
			System.out.println(price+"원");
			break;
		case "스무디":
			price = 3900*cnt;
			System.out.println(price+"원");
			break;
		case "주스":
			price = 4000*cnt;
			System.out.println(price+"원");
			break;
		default:
			System.out.println("메뉴를 잘못 입력하셨습니다.");
		}
		
	}

}
