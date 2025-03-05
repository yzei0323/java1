package day11.학생;

import java.util.ArrayList;
import java.util.Scanner;

public class 이동우_BookInfo2_출력3_배열_while_사용자책추가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//등록한 책의 정보를 저장하는 역할
		ArrayList<이동우_BookInfo2> bk = new ArrayList<>();
		
		
		//첫번째 책 배열 (여행)
		이동우_BookInfo2[] book = new 이동우_BookInfo2[3];
		
		book[0] = new 이동우_BookInfo2("리얼 프라하 2025~2026", "안지선", 18900);
		book[1] = new 이동우_BookInfo2("에이든 우리나라 전국 여행지도", "타블라라사, 이정기", 17820);
		book[2] = new 이동우_BookInfo2("디스 이즈 도쿄 THIS IS TOKYO", "박설희", 17820);
	
	
		//두번째 책 배열 (베스트셀러)
		이동우_BookInfo2[] book2 = new 이동우_BookInfo2[3];
		book2[0] = new 이동우_BookInfo2("국민이 먼저입니다", "한동훈", 19800);
		book2[1] = new 이동우_BookInfo2("초역 부처의 말", "코이케 류노스케", 16020);
		book2[2] = new 이동우_BookInfo2("환율의 대전환", "오건영", 24300);
		
		
		//사용자 입력 책 배열
		이동우_BookInfo2[] book3 = new 이동우_BookInfo2[3];
		int index = 0;
		
		loop : while(true) {
			System.out.println("1. 책 조회, 2. 책 등록, 3. 사용자 책 추가, 4. 등록된 책 조회, 5. 종료");
			
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				System.out.println("어떤 카테고리의 책 정보를 조회하시겠습니까?");
				System.out.println("1. 여행, 2. 베스트셀러");
				int select = sc.nextInt();
				
				
				if(select == 1) {
					System.out.println("여행 카테고리의 책 정보입니다.");
					for(int i = 0; i < book.length; i++) {
						System.out.println((i +1)+ "번 : " + book[i].toString());
					}
				}else if(select == 2) {
					System.out.println("베스트셀러 책 정보입니다.");
					for(int i = 0; i < book2.length; i++) {
						System.out.println((i +1) + "번 : " + book2[i].toString());
					}
					
				}else if(select != 1 || select != 2) {
					System.out.println("번호를 잘 못 입력하셨습니다.");
				}
				break;
				
			case 2:
				System.out.println("등록할 책 카테고리를 입력해 주세요");
				System.out.println("1. 여행, 2. 베스트셀러");
				int bookSelect = sc.nextInt();
				
				
//				System.out.println(bookSelect);
				
				if(bookSelect == 1) {
					System.out.println("여행관련 책을 등록합니다.");
					
				for(int i = 0; i < book.length; i++) {
					System.out.println((i +1)+ "번 : " + book[i].toString());
					}
				
				
					System.out.println("등록할 책 번호를 입력해 주세요");
					int Select2 = sc.nextInt();
					Select2--;
					이동우_BookInfo2 selectBook = book[Select2];
					System.out.println(selectBook + "를 등록합니다.");
					
					
					bk.add(selectBook);
					
				}else if(bookSelect == 2) {
					System.out.println("베스트샐러 책을 등록합니다.");
					for(int i = 0; i < book2.length; i++) {
						System.out.println((i +1) + "번 : " + book2[i].toString());
					}
					int Select3 = sc.nextInt();
					Select3--;
					이동우_BookInfo2 selectBook = book2[Select3];
					System.out.println(selectBook + "을 등록합니다.");
					
					
					bk.add(selectBook);
				}else if(bookSelect != 1 || bookSelect != 2) {
					System.out.println("잘 못 입력하셨습니다.");
				}
					
					break;
					
			case 3:
				System.out.println("새로 추가하고 싶으신 책의 정보를 입력해 주세요");
				System.out.println("3개의 책 정보를 추가할 수 있습니다.");
				
				
				System.out.println("책 제목을 입력해 주세요. ");
				String title = sc.next();
				System.out.println("책 저자를 입력해 주세요. ");
				String author = sc.next();
				System.out.println("책 가격을 입력해 주세요. ");
				int price = sc.nextInt();

				이동우_BookInfo2 b = new 이동우_BookInfo2(title, author, price);
				book3[index] = b;
				index++;
				
				System.out.println("등록이 완료되었습니다.");
			break;
					
					
			case 4:
				System.out.println("등록된 책 정보를 출력합니다.");
				System.out.println();
				System.out.println("****기존 등록된 책 즐겨찾기****");
				for(int i = 0; i < bk.size(); i++) {
					System.out.println((i+1)+ "번째 " + bk.get(i));
				}
				
				System.out.println();
				System.out.println("***사용자 추가 책 즐겨찾기***");
				for(int i = 0; i < index; i++) {
					System.out.println((i+1) + "번째 " + book3[i].toString());
				}
				System.out.println();
				break;
				
				case 5:
					System.out.println("프로그램을 종료합니다.");
					break loop;
					
				
					
			}
		
			
		}
		
	}

}
