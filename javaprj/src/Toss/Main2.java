package Toss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main2 {
	static ArrayList<User> users = new ArrayList<>();
	static User LoggedInUser = null;
	static ArrayList<Account> Accounts = new ArrayList<>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

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
				System.out.println("1.개설 2.연동 3.해지 4.조회 5.내역 6.변경 7.종료 "); // 이 부분에 계좌의 개설 등을 넣으면 됩니다.
				int menu = Integer.parseInt(sc.nextLine());
				switch(menu) {
				case 1:
					//OpenedAccount();
					break;
				case 2:
					ConnectAccount();
					break;
				case 3:
					//CancelAccount();
					break;
				case 4:
					CheckAccount();
					break;
				case 5:
					AccountHistory();
					break;
				case 6:
					UpdateAccount();
					break;
				case 7:
					//logout();
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
	
	static void ConnectAccount() {
		Scanner sc = new Scanner(System.in);
		
        System.out.print("은행명을 입력하세요:");
        String bankname = sc.nextLine();
        System.out.print("계좌번호를 입력하세요:");
        int Accountnum = Integer.parseInt(sc.nextLine());
        System.out.print("예금주명을 입력하세요:");
        String username = sc.nextLine();
        System.out.print("잔액을 입력하세요:");
        int balance = Integer.parseInt(sc.nextLine());

        Accounts.add(new Account(Accountnum, username, bankname, balance));
    }
	
	//계좌조회
	static void CheckAccount() {
	
		if(Accounts.isEmpty()) {
			System.out.println("조회할 계좌가 없습니다.");	
		}
		
		//금액순 정렬
		Collections.sort(Accounts); //오름차순
		Collections.reverse(Accounts); //반대로바꾸기(내림차순)
	
		//<은행 계좌번호 예금주 금액> 출력
		for(Account a : Accounts) {
			System.out.println(a.toString());
		}
		
	}
	
	
	//입출금내역조회
	static void AccountHistory() {	
		
	}
	
	
	//계좌정보변경
	static void UpdateAccount() {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경할 계좌의 계좌번호를 입력하세요.");
		int updateBank = sc.nextInt();
		sc.nextLine();
		for(Account a : Accounts) {
			if(a.Accountnum==updateBank) {
				System.out.print("변경할 은행명을 입력하세요:");
		        String bankname = sc.nextLine();
		        System.out.print("변경할 계좌번호를 입력하세요:");
		        int Accountnum = Integer.parseInt(sc.nextLine());
		        System.out.print("변결할 예금주명을 입력하세요:");
		        String username = sc.nextLine();
	//	        System.out.println("변경할 금액을 입력하세요:");
	//	        int balance = Integer.parseInt(sc.nextLine());
	//	 잔액도 변경을 하는게 맞나 싶어서 주석처리해놓음
		        
		        a.setBankname(bankname);
		        a.setAccountnum(Accountnum);
		        a.setUsername(username);
		        
		        System.out.println("계좌 정보가 변경되었습니다");
			}else {
				System.out.println("해당하는 계좌가 없습니다.");
			}
		}
		//아 이게.. 맞나? 잘 모르겠는뎁숑 
		
	
	}
	
	
	
}
