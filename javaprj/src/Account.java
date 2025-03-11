package Toss;

public class Account {

	String Accountnum; // 계좌번호
	String username; // 예금주명
	String bankname; // 은행명
	int balance; // 잔액

	public Account() {

	}

	public Account(String accountnum, String username, String bankname, int balance) {
		super();
		this.Accountnum = accountnum;
		this.username = username;
		this.bankname = bankname;
		this.balance = balance;
	}

	public String toString() {
		return null;
	}

	public String getAccountnum() {
		return Accountnum;
	}

	public void setAccountnum(String accountnum) {
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
	
	public int compareTo(Object o) {
		Account account = (Account)o;		
		return this.balance - account.balance; 
	}
}
