package day10.학생;

import java.util.Arrays;
import java.util.Scanner;

import day10.학생.menu;

public class MenuProgram {
	
	menu[]  list = new menu[7];
	
	

	public MenuProgram(menu[] list) {
	 
		this.list = list;
	}
	
	

	//리스트에 있는 모든 내용을 출력하며 알맞은 정보제공을 목적으로 재정의함 이 코드는 현재 사용하지 않음
	public String toString() {
		return "MenuProgram [list=" + Arrays.toString(list) + "]";
	}
	
	
	
	public void makeMenu() {
		
		list[0] = new menu("치즈라면","치즈라면은 고소한 치즈가 들어간 라면 입니다", 5000,  "라면");
		list[1] = new menu("만두라면","만두라면은 맛있는 만두가 들어간 라면 입니다", 6000,   "라면");
		list[2] = new menu("김밥","정석적인 오리지널김밥 입니다", 4500, "김밥");
		list[3] = new menu("참치김밥","훌륭한 참치가 들어간 김밥 입니다", 4800, "김밥");
		list[4] = new menu("오므라이스", "계란을 얹은 볶음밥", 7000, "볶음밥");
		list[5] = new menu("국수", "겨울에 먹고싶은 국수", 3700, "국수");
		list[6] = new menu("냉면", "겨울에 먹고싶은 냉면", 8000, "냉면");
		
	}
	
	
	
	public void run() {
		
		System.out.println("메뉴에 오신것을 환영합니다");
		System.out.println("원하시는 메뉴의 가격을 입력해주시면 진행하겠습니다");
		System.out.println("치즈라면: 5000, 만두라면: 6000, 김밥: 4500, 참치김밥: 4800, 오므라이스: 7000, 국수: 3700, 냉면: 8000");
		
		Scanner sc = new  Scanner( System.in);
		
		
		int price = sc.nextInt();
		
		switch( price) {
		case 5000:
			System.out.println(  list[0].toString());
			
			break;
		case 6000:
			System.out.println( list[1].toString());
			break;
		case 4500:
			System.out.println( list[2].toString());
			break;
		case 4800:
			System.out.println( list[3].toString());
			break;
		case 7000:
			System.out.println( list[4].toString());
			break;
		case 3700:
			System.out.println( list[5].toString());
			break;
		case 8000:
			System.out.println( list[6].toString());
			break;
			
		}
		
		
		
		
		
	}
	
	
	/*
	 * 	String name;
	String info;
	int price;
	int userPrice;
	String category;
	
	 */
	
	
//	public static void main(String[] args) {
//		
//		menu[] list  = new menu[4];
//		list[0] = new menu("치즈라면","치즈라면은 고소한 치즈가 들어간 라면 입니다", 5000,  "라면");
//		list[1] = new menu("만두라면","만두라면은 맛있는 만두가 들어간 라면 입니다", 6000,   "라면");
//		list[2] = new menu("김밥","정석적인 오리지널김밥 입니다", 4500, "김밥");
//		list[3] = new menu("참치김밥","훌륭한 참치가 들어간 김밥 입니다", 4800, "김밥");
//		
//		
//		MenuProgram   p = new MenuProgram (list );
//		
//		p.run();
//		//System.out.println( p);
//		
//	}
	

}
