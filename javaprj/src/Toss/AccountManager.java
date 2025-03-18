package Toss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AccountManager extends Account {

	Scanner sc = new Scanner(System.in);

	public AccountManager() {

	}

	public void OpenedAccount(Scanner sc) {
		int accountType;
		while (true) {
			System.out.println("생성할 계좌 유형을 선택하세요. 1. 입출금 계좌  2. 주식 계좌");
			accountType = Integer.parseInt(sc.nextLine());

			if (accountType == 1 || accountType == 2) {
				break;
			} else {
				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
			}
		}

		System.out.println("은행을 선택하세요. 1. 신한은행 2. 우리은행 3. 하나은행 4. IBK기업은행 5. KB국민은행");
		int banknum = Integer.parseInt(sc.nextLine());
		String bank = "";

		switch (banknum) {
		case 1:
			bank = "신한은행";
			break;
		case 2:
			bank = "우리은행";
			break;
		case 3:
			bank = "하나은행";
			break;
		case 4:
			bank = "IBK기업은행";
			break;
		case 5:
			bank = "KB국민은행";
			break;
		default:
			System.out.println("입력이 잘못됐습니다.");
			return;
		}

		String name = Main.LoggedInUser.getName();
		System.out.println("계좌의 잔액을 설정하세요");
		int money = Integer.parseInt(sc.nextLine());

		long accountNum = (long) (Math.random() * 1000000000);

		Account account;
		if (accountType == 1) {
			account = new BankAccount(accountNum, name, bank, money);
		} else {
			account = new StockAccount((int) accountNum, name, bank, money);
		}

		Main.accounts.add(account);
		Main.saveAccountsToFile();

		System.out.println("계좌 개설 완료!");
		System.out.println(account);
	}

	public void ConnectAccount(Scanner sc) {
		Main.loadAccountsFromFile();

		String currentUser = Main.LoggedInUser.getName();

		ArrayList<Account> userAccounts = new ArrayList<>();
		for (Account account : Main.accounts) {
			if (account.getUsername().equals(currentUser)) {
				userAccounts.add(account);
			}
		}

		if (userAccounts.isEmpty()) {
			System.out.println("연동할 계좌가 없습니다.");
			return;
		}

		System.out.println("연동할 계좌를 선택하세요:");
		for (int i = 0; i < userAccounts.size(); i++) {
			System.out.println((i + 1) + ". " + userAccounts.get(i));
		}

		int select = Integer.parseInt(sc.nextLine());
		if (select < 1 || select > userAccounts.size()) {
			System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			return;
		}

		Main.AccountIn = userAccounts.get(select - 1);

		if (Main.AccountIn.getAccountType().equals("입출금 계좌")) {
			Main.AccountIn.setAccountType("입출금 계좌");
		} else if (Main.AccountIn.getAccountType().equals("주식 계좌")) {
			Main.AccountIn.setAccountType("주식 계좌");
		}

		System.out.println("계좌가 성공적으로 연동되었습니다!");
		System.out.println("연동된 계좌: " + Main.AccountIn);
	}

	public void CancelAccount(Scanner sc) {
		if (Main.accounts.isEmpty()) {
			System.out.println("해지할 계좌가 없습니다.");
			return;
		}

		System.out.println("해지할 계좌를 선택하세요:");
		for (int i = 0; i < Main.accounts.size(); i++) {
			System.out.println((i + 1) + ". " + Main.accounts.get(i));
		}

		int select = Integer.parseInt(sc.nextLine());
		if (select < 1 || select > Main.accounts.size()) {
			System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			return;
		}

		Main.accounts.remove(select - 1);

		System.out.println("계좌가 성공적으로 해지되었습니다!");
	}

	public void CheckAccount(Scanner sc) {
		Main.loadAccountsFromFile();
		String currentUser = Main.LoggedInUser.getName();

		ArrayList<Account> userAccounts = new ArrayList<>();
		for (Account account : Main.accounts) {
			if (account.getUsername().equals(currentUser)) {
				userAccounts.add(account);
			}
		}

		if (userAccounts.isEmpty()) {
			System.out.println("조회할 계좌가 없습니다.");
			return;
		}

		int totalBalance = 0;
		System.out.println("=== 내 계좌 목록 ===");

		for (Account account : userAccounts) {
			System.out.println(account);
			totalBalance += account.getBalance();
		}

		System.out.println("=================");
		System.out.println("총 보유금: " + totalBalance + "원");
		System.out.println("=================");
	}

	public void AccountHistory(Scanner sc) {
		System.out.println("=== 송금 및 인출 내역 조회 ===");

		if (Main.AccountIn == null) {
			System.out.println("연결된 계좌가 없습니다.");
			return;
		}

		Main.histories.clear();

		try (BufferedReader reader = new BufferedReader(new FileReader("res/History.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				String[] data = line.split(",");

				if (data[1].equals(Long.toString(Main.AccountIn.getAccountnum()))
						|| data[3].equals(Long.toString(Main.AccountIn.getAccountnum()))) {
					History history = new History(data[0], Long.parseLong(data[1]), data[2], Long.parseLong(data[3]),
							Integer.parseInt(data[4]), java.time.LocalDateTime.parse(data[5]), data[6]);

					Main.histories.add(history);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (Main.histories.isEmpty()) {
			System.out.println("해당 계좌에 송금 및 인출 내역이 없습니다.");
		} else {
			for (History h : Main.histories) {
				System.out.println(h);
			}
		}
	}

	public void UpdateAccount(Scanner sc) {
		if (Main.accounts.isEmpty()) {
			System.out.println("변경할 계좌가 없습니다.");
			return;
		}

		System.out.println("변경할 계좌를 선택하세요:");
		for (int i = 0; i < Main.accounts.size(); i++) {
			System.out.println((i + 1) + ". " + Main.accounts.get(i));
		}

		int select = Integer.parseInt(sc.nextLine());
		if (select < 1 || select > Main.accounts.size()) {
			System.out.println("잘못된 입력입니다. 다시 시도하세요.");
			return;
		}

		Account selectedAccount = Main.accounts.get(select - 1);

		System.out.println("은행을 선택하세요. 1. 신한은행 2. 우리은행 3. 하나은행 4. IBK기업은행 5. KB국민은행");
		int banknum = Integer.parseInt(sc.nextLine());
		String bank = "";

		switch (banknum) {
		case 1:
			bank = "신한은행";
			break;
		case 2:
			bank = "우리은행";
			break;
		case 3:
			bank = "하나은행";
			break;
		case 4:
			bank = "IBK기업은행";
			break;
		case 5:
			bank = "KB국민은행";
			break;
		default:
			System.out.println("입력이 잘못됐습니다.");
			return;
		}

		long accountNum = (long) (Math.random() * 1000000000);

		System.out.print("변경할 예금주명을 입력하세요: ");
		String username = sc.nextLine();

		selectedAccount.setBankname(bank);
		selectedAccount.setAccountnum(accountNum);
		selectedAccount.setUsername(username);

		System.out.println("계좌 정보가 성공적으로 변경되었습니다.");
		System.out.println("변경된 계좌 정보: " + selectedAccount);
	}

}
