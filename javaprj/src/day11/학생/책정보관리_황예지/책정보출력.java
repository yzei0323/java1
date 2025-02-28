package day10.practice;

import java.util.Scanner;

public class 책정보출력 {
	
	Scanner sc = new Scanner(System.in);
	
	Book[] books = new Book[5];	//5개 이내 등록가능
	
	int index =0;
	
	
	public void 등록하기() {
		System.out.println("책 제목을 입력하세요");
		String title = sc.next();
		System.out.println("작가의 이름을 입력하세요");
		String author = sc.next();
		System.out.println("책 가격을 입력하세요");
		int price = sc.nextInt();
		
		Book b = new Book(title, author, price);
		books[index] = b;
		index++;
	}

	
	public void 조회하기() {
		for(int i=0; i<index; i++) {
			System.out.println((i+1) +" "+ books[i].toString());	
		}
		if(index==0) {
			System.out.println("등록된 책 정보가 없습니다");
		}
	}
	
	public void 변경하기() {
		System.out.println("수정할 책 번호를 입력하세요");
		int updateNo = sc.nextInt();
		updateNo=updateNo-1;
		
		System.out.println("수정할 것을 선택하세요");
		System.out.println("1.제목   2.작가   3.가격   4.종료");
		int menu2 = sc.nextInt();
		
		switch(menu2) {
		case 1: 
			System.out.println("변경할 책 제목을 입력하세요");
			String updateTitle =  sc.next();
			Book update1 = books[updateNo];
			update1.setTitle(updateTitle);
			System.out.println("변경되었습니다");
			break;
		case 2:
			System.out.println("변경할 작가 이름을 입력하세요");
			String updateAuthor =  sc.next();
			Book update2 = books[updateNo];
			update2.setAuthor(updateAuthor);
			System.out.println("변경되었습니다");
			break;
		case 3:
			System.out.println("변경할 책 가격을 입력하세요");
			int updatePrice =  sc.nextInt();
			Book update3 = books[updateNo];
			update3.setPrice(updatePrice);
			System.out.println("변경되었습니다");
			break;
		case 4:
			System.out.println("변경을 종료합니다");
			break;
		default:
			System.out.println("잘못 선택하셨습니다");
		}
	}
	
	public void 삭제하기() {
		System.out.println("삭제할 책 번호를 입력하세요");
		int deleteNo = sc.nextInt();
		deleteNo = deleteNo-1;
		for(int i=deleteNo; i<books.length-1; i++) {
			books[i]=books[i+1];
		}
		index--;
		System.out.println("삭제되었습니다");
	}
	
	public void run() {
		loop:while(true) {
			System.out.println("1.등록   2.조회   3.변경   4.삭제   5.종료");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				등록하기();
				break;
				
			case 2:
				조회하기();
				break;
				
			case 3:
				변경하기();
				break;
				
			case 4:
				삭제하기();
				break;
				
			case 5:
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("다시 선택하세요");
			}
		}
	}
	
	public static void main(String[] args) {
	
		//추가문제1. 메뉴를 제공하여 객체배열에 책 정보를 저장하고 출력하기
	
		책정보출력 a = new 책정보출력();
		
		a.run();
				
	}
}
