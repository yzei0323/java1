package day13.학생;

import java.util.Scanner;

public class 이정호_Main {

	public static void main(String[] args) {
		이정호_Mon mon = new 이정호_Mon();
		이정호_Tue tue = new 이정호_Tue();
		이정호_Wen wen = new 이정호_Wen();
		이정호_Thu thu = new 이정호_Thu();
		이정호_Fri fri = new 이정호_Fri();
		이정호_Pizza pizza = new 이정호_Pizza();
		
		Scanner scan = new Scanner(System.in);
		
		loop : while(true) {
			System.out.print("요일을 입력하세요(일 ~ 토), stop를 입력하면 종료 : ");
			String week = scan.next();
			System.out.println();
			
			switch(week) {
			case "월":
				mon.printPizza();
				break;
			case "화":
				tue.printPizza();
				break;
			case "수":
				wen.printPizza();
				break;
			case "목":
				thu.printPizza();
				break;
			case "금":
				fri.printPizza();
				break;
			case "stop":
				System.out.println("종료되었습니다");
				break loop;
			default:
				pizza.printPizza();
				System.out.println();
			}
		}

	}

}
