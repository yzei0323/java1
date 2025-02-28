package 책정보;

import java.util.Scanner;

public class bookList {

	book b = new book("반지의제왕", "J.R.R 톨킨", 100000);
	book b2 = new book("메트로2033", "드미트리 글루홉스키", 40000);
	book b3 = new book("헝거게임", "수잔 콜린스", 41000);
	Scanner sc = new Scanner(System.in);
	int index = 0;
	book[] bookList = new book[3];
	book[] boList = new book[3];
	
	public void makeList() {
		bookList[0] = new book("반지의제왕", "J.R.R 톨킨", 100000);
		bookList[1] = new book("메트로2033", "드미트리 글루홉스키", 40000);
		bookList[2] = new book("헝거게임", "수잔 콜린스", 41000);
	}
	
	public String toString() {
		return "책의 목록 : " + bookList[0] +  bookList[1] + bookList[2]; 
	}
	public void runMain() {
		while(true) {
			System.out.println("도서관대여프로그램에 오신것을 환영합니다");
			System.out.println("책 조회: 1    책 대여: 2     대여목록 조회: 3");
			int select = sc.nextInt();
			switch(select) {
			
			case 1:
				printList();
				break;
			case 2:
				System.out.println("대여하고 싶은 책의 이름을 입력해 주십시오");
				printList();
				String borrow = sc.next();
				System.out.println(borrow);
				if(borrow.equals("반지의제왕")) {
					boList[index] = bookList[0];
					index++;
					System.out.println("대여가 완료되었습니다");
					break;
				}else if(borrow.equals("메트로2033")) {
					boList[index] = bookList[1];
					index++;
					System.out.println("대여가 완료되었습니다");
					break;
				}else if(borrow.equals("헝거게임")) {
					boList[index] = bookList[2];
					index++;
					System.out.println("대여가 완료되었습니다");
					break;
				}else {
					System.out.println("책의 이름을 정확히 입력해 주십시오");
					break;
				}
			case 3:
				printBoList();
				break;
			
			default:
				System.out.println("잘못입력하셨습니다");
			}
		}
	}
	

	
	public void printList() {
		for(int i=0; i<bookList.length; i++) {
			System.out.println(bookList[i].toString());
		}
	}
	public void printBoList() {
		for(int i=0; i<boList.length; i++) {
			System.out.println(boList[i]);
		}
	}
}
