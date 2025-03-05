package day11.학생;

import java.util.Scanner;

public class 이정호_책정보 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		이정호_Book[] list = new 이정호_Book[4];

		list[0] = new 이정호_Book("국어책", "국어교수", 12000);
		list[1] = new 이정호_Book("수학책", "수학교수", 14000);
		list[2] = new 이정호_Book("영어책", "영어교수", 16000);
		list[3] = new 이정호_Book("과학책", "과학교수", 18000);
		
		int result = 0; //계산 값
		
		loop : while(true) {
			System.out.print("1.책 목록 2.구매 3.계산 4.종료 : ");
			int menu = scan.nextInt();
			System.out.println();
			
			switch(menu) {
			case 1:
				for(int i = 0; i < list.length; i++) {
					System.out.println(list[i].toString());
				}
				System.out.println();
				break;
			case 2:
				System.out.print("책 제목을 입력하세요 : ");
				String book = scan.next();
				
				System.out.print("구매할 권수를 입력하세요 : ");
				int count = scan.nextInt();
				
				boolean isBook = false;
				
				for(int i = 0; i < list.length; i++) {
					if(list[i].title.equals(book)) {
						result += list[i].price * count;
						isBook = true;
					}
				}
				
				if(isBook == false) {
					System.out.println();
					System.out.println("없는 책입니다.");
				}
				
				System.out.println();
				break;
			case 3:
				System.out.println(result + "원");
				System.out.println();
				break loop;
			case 4:
				break loop;
			default :
				System.out.println("메뉴가 잘못됐습니다");
				System.out.println();
			}
			
		}
	}
}
