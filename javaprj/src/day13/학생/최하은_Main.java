package day13.학생;

import java.util.Scanner;

public class 최하은_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		최하은_Nation ct = new 최하은_Nation();
		최하은_Nation KR = new 최하은_Korea();
		최하은_Spain ES = new 최하은_Spain();
		최하은_England UK  = new 최하은_England();
		최하은_Japan JP = new 최하은_Japan();
		최하은_Portugal PRT = new 최하은_Portugal();
		최하은_France FRA = new 최하은_France();
		
		System.out.println("다음 나라들의 수도를 맞춰볼까요?");
		ct.capital();
		
		loop:while(true) {
			System.out.println("정답을 확인할 나라를 입력하세요.(끝 입력 시 종료)");
			String nation = sc.nextLine();
			
			switch(nation) {
			case "대한민국":
				KR.capital();
				break;
			case "스페인":
				ES.capital();
				break;
			case "영국":
				UK.capital();
				break;
			case "일본":
				JP.capital();
				break;
			case "포르투갈":
				PRT.capital();
				break;
			case "프랑스":
				FRA.capital();
				break;
			case "끝":
				System.out.println("끝~!");
				break loop;
			default:
				System.out.println("보기의 나라 중 입력하세요.");
				ct.capital();
			}
		}
		
		
		
	}

}
