package day11.학생;

import java.util.ArrayList;
import java.util.Scanner;

public class 박시우_주식시뮬레이터 {
	ArrayList<박시우_Stock> list = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		박시우_주식시뮬레이터 stock_simul = new 박시우_주식시뮬레이터();
		stock_simul.run();
	}

	public void run() {
		// while문으로 종료할때까지 주식 입력받기
		createStocks();
		// 주식 옵션 설정
		setStockOption();
		// 입력받은 주식정보 출력
		stockInfo();
	}

	// 주식 구매(주식 객체 생성)
	public void createStocks() {
		loop: while (true) {
			System.out.println("구매하시겠습니까? 구매/종료");
			String buyOrsell = sc.next();
			if (buyOrsell.equals("구매")) {
				System.out.println("구매할 주식명과 수량을 입력하세요");
				list.add(new 박시우_Stock(sc.next(), sc.nextInt()));
			} else {
				break loop;
			}
		}
	}

	public void setStockOption() {
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setOptions();
		}
	}

	// 주식 정보 출력
	public void stockInfo() {
		for (박시우_Stock i : list) {
			System.out.println(i.toString());
		}
	}
	
	public void stock_automation() {
		for (박시우_Stock i : list) {
			if(i.bid<i.limit_order_over) {
				//지정상한가에 도달하면 판매하는 기능 작성해야함
				System.out.println(i.limit_order_over*i.cnt-i.bid*i.cnt); //얼마가 이득보고 팔았는지
			} else if(i.bid>i.limit_order_under) {
				//지정하한가에 도착하면 5주 추가구매하는 기능 작성해야함
				System.out.println(i.stock+"를 5주 추가구매하였습니다");
				i.cnt+=5;
				i.currentPrice=i.bid*i.cnt;
			}
		}
	}
	
	//수동으로 구매/판매하는 메소드 작성해야함
	
	

}
