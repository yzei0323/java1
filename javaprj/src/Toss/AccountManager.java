package Toss;

import java.util.Collections;
import java.util.Scanner;

public class AccountManager {
    static String[] AccountList = new String[10];
    static int AccountIndex = 0;
    
    static String[] PairingAccountList = new String[10];
    static int PairingAccountIndex = 0;
    
    Scanner sc = new Scanner(System.in);
    
    public AccountManager() {
        
    }
    
    public void OpenedAccount() {
        System.out.println("은행을 선택하세요. 1. 신한은행 2. 우리은행 3. 하나은행 4. IBK기업은행 5. KB국민은행");
        int banknum = sc.nextInt();

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

        String name = Main.LoggedInUser.getName(); // 현재 로그인된 사용자의 이름을 예금주명으로 사용

        System.out.println("입금할 금액을 입력하세요: ");
        int money = sc.nextInt();

        String number = "";
        for(int i = 0; i < 12; i++) {
            int num = (int) (Math.random() * 10);
            number += num;
        }

        Account account = new Account(number, name, bank, money);

        AccountList[AccountIndex] = "은행: " + account.getBankname() + ", 계좌번호: " + account.getAccountnum() + 
                ", 예금주명: " + account.getUsername() + ", 잔액: " + account.getBalance();

        System.out.println("계좌 개설 완료!");
        System.out.println(AccountList[AccountIndex]);

        AccountIndex++;
    }

    
    public void ConnectAccount() {
        System.out.println("연동할 계좌를 선택하세요: ");
        
        if (AccountIndex == 0) {
            System.out.println("연동할 계좌가 없습니다.");
            return;
        }

        for (int i = 0; i < AccountIndex; i++) {
            System.out.println((i + 1) + ". " + AccountList[i]);
        }
        
        int select = sc.nextInt();
        
        if (select < 1 || select > AccountIndex) {
            System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            return;
        }
        
        PairingAccountList[PairingAccountIndex] = AccountList[select - 1];
        PairingAccountIndex++;
        
        for (int i = select - 1; i < AccountIndex - 1; i++) {
            AccountList[i] = AccountList[i + 1];
        }

        AccountList[AccountIndex - 1] = null;
        AccountIndex--;

        System.out.println("계좌가 성공적으로 연동되었습니다!");
        System.out.println("연동된 계좌: " + PairingAccountList[PairingAccountIndex - 1]);
    }
    
    public void CancelAccount() {
        System.out.println("해지할 계좌를 선택하세요: ");
        
        if (PairingAccountIndex == 0) {
            System.out.println("해지할 계좌가 없습니다.");
            return;
        }

        for (int i = 0; i < PairingAccountIndex; i++) {
            System.out.println((i + 1) + ". " + PairingAccountList[i]);
        }
        
        int select = sc.nextInt();
        
        if (select < 1 || select > PairingAccountIndex) {
            System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            return;
        }

        for (int i = select - 1; i < PairingAccountIndex - 1; i++) {
            PairingAccountList[i] = PairingAccountList[i + 1];
        }

        PairingAccountList[PairingAccountIndex - 1] = null;
        PairingAccountIndex--;

        System.out.println("계좌가 성공적으로 해지되었습니다!");

        if (PairingAccountIndex == 0) {
            System.out.println("현재 연동된 계좌가 없습니다.");
        } else {
            System.out.println("남은 연동된 계좌 목록:");
            for (int i = 0; i < PairingAccountIndex; i++) {
                System.out.println((i + 1) + ". " + PairingAccountList[i]);
            }
        }
    }

    public void CheckAccount() {
        System.out.println("연동된 계좌 목록:");

        if (PairingAccountIndex == 0) {
            System.out.println("현재 연동된 계좌가 없습니다.");
        } else {
            for (int i = 0; i < PairingAccountIndex; i++) {
                System.out.println((i + 1) + ". " + PairingAccountList[i]);
            }
        }
        
        int totalBalance = 0;

        for (int i = 0; i < PairingAccountIndex; i++) {
            System.out.println((i + 1) + ". " + PairingAccountList[i]);

            String accountInfo = PairingAccountList[i];
            int balanceIndex = accountInfo.lastIndexOf("잔액: ") + 4;
            String balanceString = accountInfo.substring(balanceIndex).trim();
            int balance = Integer.parseInt(balanceString);
            totalBalance += balance;
        }

        System.out.println("총 자산: " + totalBalance + "원");
    }
    
    public void AccountHistory() {
    	
    }
}
