package day11.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class 일정관리 {
	
	ArrayList<일정> list = new ArrayList<>();
	static Scanner sc = new Scanner(System.in);
	int idx=0;
	
	public void 등록() {
		System.out.println("일정의 날짜, 일행, 장소, 일정을 입력하세요");
		list.add(new 일정(sc.nextInt(),sc.next(),sc.next(),sc.next()));
		idx++;
	}

	public void 조회() {
		System.out.println("==================================");
		if(list.isEmpty()) {
			System.out.println("일정을 함께하실 분이 없나요?");
		}else {
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i).date+"일 "+list.get(i).with+"와(과) "+list.get(i).where+"에서 "+list.get(i).toDo); 
			}
		}
			
		System.out.println("==================================");
	}
//	public void 조회() {
//		System.out.println("==================================");
//		for(일정 i : list) {
//			if(i==null) {
//				System.out.println("일정을 함께하실 분이 없나요?");
//			}else {
//				System.out.println(i.date+"일 "+i.with+"와(과) "+i.where+"에서 "+i.toDo); 
//			}
//		}
//		
//		System.out.println("==================================");
//	}
	
	public void 변경() {
		조회();
		System.out.println("변경할 일정의 날짜를 입력하세요");
		int updateDate = sc.nextInt();
		for(int i=0; i<idx; i++) {
			if(list.get(i).date==updateDate) {
				System.out.println("변경할 일정의 날짜, 일행, 장소, 일정을 입력하세요");
				list.set(i,new 일정(sc.nextInt(),sc.next(),sc.next(),sc.next()));
				//여기서부터 부탇르릴게ㅕ 새로만든거 삽입은 했어요
				//예
			}
		}
		System.err.println("변경되었습니다!");
	}
	
	public void 삭제() {
	    조회();
	    System.out.println("삭제할 일정의 날짜를 입력하세요");
	    int deleteDate = sc.nextInt();
	    
	    for (int i = 0; i < idx; i++) {
	        if (list.get(i).date == deleteDate) {
	            list.remove(i);  // 해당 일정 삭제
	            idx--;            // 인덱스도 하나 줄여줍니다.
	            System.err.println("삭제되었습니다");
	            break;            // 삭제 후 루프 종료
	        }else {
	        	System.out.println("선택하신 날짜에 일정이 없습니다");
	        }
	    }
	    
	}

	
	
	public static void main(String[] args) {
		
		일정관리 a = new 일정관리();
		
	
		
		loop:while(true) {
			System.out.println("1.등록   2.조회   3.변경   4.삭제    5.종료");

			int menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				a.등록();
				break;
			case 2:
				a.조회();
				break;
			case 3:
				a.변경();
				break;
			case 4:
				a.삭제();
				break;
			case 5:
				System.out.println("종료합니다");
				break loop;
			default:
				System.out.println("잘못 선택하셨습니다");
				break;
			}
		}
	}

}
