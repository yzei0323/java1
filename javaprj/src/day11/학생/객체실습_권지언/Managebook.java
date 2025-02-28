package day10_권지언;

import java.util.Scanner;

public class Managebook {

	static int idx = 0;
	static Book[] arr = new Book[0];

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		loop: while (true) {
			System.out.println("1.등록 2.삭제 3.조회 4.변경 5.종료");
			int num = Integer.parseInt(sc.nextLine());

			switch (num) {
			case 1:
				System.out.println("책 이름");
				String title = sc.nextLine();
				System.out.println("작가 이름");
				String author = sc.nextLine();
				System.out.println("가격");
				int price = Integer.parseInt(sc.nextLine());
				arr = createBook(arr, title, author, price);
				break;

			case 2:
				System.out.println("어떤 인덱스의 책을 삭제하시겠습니까?");
				int deleteIndex = Integer.parseInt(sc.nextLine()) - 1;
				arr = deleteBook(arr, deleteIndex);
				break;

			case 3:
				selectBook();
				break;

			case 4:
				System.out.println("어떤 인덱스의 책을 변경하시겠습니까?");
				int updateIndex = Integer.parseInt(sc.nextLine()) - 1;
				updateBook(arr, updateIndex, sc);
				break;

			case 5:
				System.out.println("프로그램 종료");
				break loop;

			default:
				System.out.println("잘못된 입력입니다");
			}
		}
		sc.close();
	}

	public static Book[] createBook(Book[] arr, String title, String author, int price) {
		Book newBook = new Book(title, author, price);
		Book[] newBooks = new Book[arr.length + 1];

		for (int i = 0; i < arr.length; i++) {
			newBooks[i] = arr[i];
		}
		newBooks[arr.length] = newBook;
		idx++;
		System.out.println("등록 성공");
		return newBooks;
	}

	public static Book[] deleteBook(Book[] arr, int deleteIndex) {
		if (deleteIndex < 0 || deleteIndex >= arr.length) {
			System.out.println("잘못된 입력입니다");
			return arr;
		}

		Book[] newBooks = new Book[arr.length - 1];
		for (int i = 0, j = 0; i < arr.length; i++) {
			if (i != deleteIndex) {
				newBooks[j++] = arr[i];
			}
		}
		idx--;
		System.out.println("삭제 성공");
		return newBooks;
	}

	public static void selectBook() {
		if (idx == 0) {
			System.out.println("아직 아무 정보도 없습니다");
		}
		for (int i = 0; i < idx; i++) {
			System.out.println((i + 1) + ". " + arr[i].toString());
		}
	}

	public static void updateBook(Book[] arr, int updateIndex, Scanner sc) {
		if (updateIndex < 0 || updateIndex >= arr.length) {
			System.out.println("잘못된 입력입니다");
		} else {
			System.out.println("어떤 정보를 수정하시겠습니까?");
			String input = sc.nextLine();
			if (input.equals("제목")) {
				System.out.println("수정할 제목을 입력하세요");
				String newtitle = sc.nextLine();
				Book search = arr[updateIndex];
				search.Settitle(newtitle);
				System.out.println("변경완료");
			} else if (input.equals("작가")) {
				System.out.println("수정할 작가이름을 입력하세요");
				String newauthor = sc.nextLine();
				Book search = arr[updateIndex];
				search.Setauthor(newauthor);
				System.out.println("변경완료");
			} else if (input.equals("가격")) {
				System.out.println("수정할 가격을 입력하세요");
				int newprice = Integer.parseInt(sc.nextLine());
				Book search = arr[updateIndex];
				search.Setprice(newprice);
				System.out.println("변경완료");
			} else {
				System.out.println("잘못된 입력입니다");
			}
		}

	}
}
