package Toss;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BankAccount extends Account {

	public BankAccount(long accountnum, String username, String bankname, int balance) {
		super(accountnum, username, bankname, balance, "입출금 계좌");
	}

	public void deposit(String receiverName, long receiverAccountNum, int amount) {
		if (amount <= 0 || amount > this.getBalance()) {
			System.out.println("송금 금액이 잘못되었거나 잔액이 부족합니다.");
			return;
		}

		this.setBalance(this.getBalance() + amount);

		History history = new History(this.getUsername(), this.getAccountnum(), receiverName, receiverAccountNum,
				amount, java.time.LocalDateTime.now(), "송금");

		Main.histories.add(history);
		saveHistoryToFile(history);

		System.out.println(receiverName + "에게 " + amount + "원이 송금되었습니다. 현재 잔액: " + this.getBalance());
	}

	public void withdraw(int amount) {
		if (amount <= 0 || amount > this.getBalance()) {
			System.out.println("인출 금액이 잘못되었거나 잔액이 부족합니다.");
			return;
		}

		this.setBalance(this.getBalance() - amount);

		History history = new History(this.getUsername(), this.getAccountnum(), "-", 0, amount,
				java.time.LocalDateTime.now(), "인출");

		Main.histories.add(history);
		saveHistoryToFile(history);

		System.out.println(amount + "원이 인출되었습니다. 현재 잔액: " + this.getBalance());
	}

	private void saveHistoryToFile(History history) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("res/History.txt", true))) {
			writer.write(history.toFileString());
			writer.newLine();
		} catch (IOException e) {
			System.out.println("파일 저장 중 오류 발생: " + e.getMessage());
		}
	}

	@Override
	public String toString() {
		return "입출금계좌정보 [ 이름:" + username + ", 계좌번호:" + Accountnum + ", 은행:" + bankname + ", 예치금:" + balance + "원 ]\n";
	}
}
