package Toss;

public class Account implements Comparable{

	int Accountnum; // 계좌번호
	String username; // 예금주명
	String bankname; // 은행명
	int balance; // 잔액

	public Account() {

	}

	public Account(int accountnum, String username, String bankname, int balance) {
		super();
		Accountnum = accountnum;
		this.username = username;
		this.bankname = bankname;
		this.balance = balance;
	}

	public String toString() {
		return bankname+" "+Accountnum+" "+username+" "+balance+"원";
	}

	public int getAccountnum() {
		return Accountnum;
	}

	public void setAccountnum(int accountnum) {
		Accountnum = accountnum;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public int compareTo(Object o) {
		Account account = (Account)o;		
		return this.balance - account.balance; 
	}

}
