package Toss;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<User> users = new ArrayList<>();
	static User LoggedInUser = null;
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Account> Account = new ArrayList<>();

		loop: while (true) {
			if (LoggedInUser == null) {
				System.out.println("1. 회원가입 2. 로그인 3. 종료");
				int choice = Integer.parseInt(sc.nextLine());
				switch (choice) {
				case 1:
					signUp(sc);
					break;
				case 2:
					login(sc);
					break;
				case 3:
					System.out.println("프로그램 종료");
					System.exit(0);
				default:
					System.out.println("잘못된 입력입니다");
				}
			} else {
				AccountManager o = new AccountManager();
				
				System.out.println("1. 신규 계좌 개설 2. 연동 3. 해지 4. 조회 5. 내역 6. 변경 7. 로그아웃");
				int select = sc.nextInt();
				
				switch(select) {
					case 1:
						o.OpenedAccount();
						break;
					case 2:
						o.ConnectAccount();
						break;
					case 3:
						o.CancelAccount();
						break;
					case 4:
						o.CheckAccount();
						break;
					case 5:
						o.AccountHistory();
						break;
					case 7:
						// logout();
						System.out.println("종료합니다.");
						break loop;
					default: System.out.println("잘못된 입력입니다");
				}
			}
		}
	}

	static void signUp(Scanner sc) {
		System.out.println("이름을 입력하세요:");
		String name = sc.nextLine();
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String password = sc.nextLine();

		for (User User : users) {
			if (User.id.equals(id)) {
				System.out.println("이미 존재하는 아이디입니다.");
				return;
			}
		}
		users.add(new User(name, id, password));
		System.out.println("회원가입 성공!");
	}

	static void login(Scanner sc) {
		System.out.println("아이디를 입력하세요:");
		String id = sc.nextLine();
		System.out.println("비밀번호를 입력하세요:");
		String password = sc.nextLine();

		for (User User : users) {
			if (User.id.equals(id) && User.password.equals(password)) {
				LoggedInUser = User;
				System.out.println(User.name + "님 반갑습니다!");
				return;
			}
		}
		System.out.println("로그인 실패: 아이디 또는 비밀번호가 일치하지 않습니다");
	}
}
