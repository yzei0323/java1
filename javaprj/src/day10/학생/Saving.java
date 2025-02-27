package day10.학생;

import java.util.ArrayList;
import java.util.Scanner;

public class Saving {

	
	Scanner sc = new Scanner(System.in);
	
	String name; //이름
	String purpose; //목적
	int cost; //금액
	int total; //총금액
	
	//각 적금을 저장할 리스트
	 ArrayList<Integer> savings = new ArrayList<>();
	
	public void openAcount() { //정보 입력
		
		//계좌 개설
		while(true) {
			if(name == null) {
				System.out.print("이름을 입력해 주세요 : ");
				this.name = sc.next();
			}else if(purpose == null) {
				System.out.print("목적을 입력해 주세요 : ");
				this.purpose = sc.next();
			}else if(name != null || purpose !=null) {
				System.out.println("계좌 계설이 완료되었습니다.");
				break;
			}
			
		}

	}
		
		

	//적금 금액 입력
	public void count() {
		System.out.println("적금하실 금액을 입력해 주세요");
		this.cost = sc.nextInt();
		this.total += this.cost; //총금액
		savings.add(this.cost); // 적금 금액을 리스트에 추가하기
		System.out.println(this.cost + "원이 적금되었습니다.");
		
		
	}
	
	
	//추가로 적금할 금액이 있는지
	public void addAcount() { //추가적금
		System.out.println("추가로 적금하실 금액을 입력해 주세요.(0을 입력시 종료)");
		
		
		while(true) {
			int addCost = sc.nextInt();
			
			//0을 입력하면 while문 종료
			if(addCost == 0) {
				System.out.println("계좌 정보를 출력합니다.");
				break;
			}else if(addCost > 0) {
				 this.total += addCost; // 총 금액 증가
				 this.savings.add(addCost); //입력한 금액 ArrayList에 넣기
				 
			 System.out.println(addCost + "원이 추가 적금되었습니다.");
			}
				
		}
	
		
	}
	
	
	//계좌 정보 출력
	public void outPut() {
		
		System.out.println("이름 : " + name);
		System.out.println("목적 : " + purpose);
		
		//ArrayList의 전체 길이를 리턴
		//여기성는 count 와 addAcount에서 입력 받은 길이만큼 길이를 가져옴
		for(int i = 0; i < this.savings.size(); i++) { 
			
			//get() = ArrayList의 데이터를 가져옴
			//ArrayList의 값이 0부터 시작하기 때문에 1을 추가하여 1부터 출력하게 만듬
			System.out.println((i+1) + "번째 추가 금액 : " + this.savings.get(i) + "원"); 
		}
		System.out.println("총금액 : " + this.total + "원");
	}
	
	
	
	
}
