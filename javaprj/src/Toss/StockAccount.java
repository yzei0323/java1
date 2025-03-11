package Toss;

public class StockAccount extends Account {

	public StockAccount(int accountnum, String username, String bankname, int balance) {
		super(accountnum, username, bankname, balance, "주식 계좌");
	}
}
