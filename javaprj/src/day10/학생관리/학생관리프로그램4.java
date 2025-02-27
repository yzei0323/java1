package day10.학생관리;

import java.util.Scanner;

public class 학생관리프로그램4 {

	
	Scanner sc = new Scanner( System.in);
	Student[] list  = new Student[10];
	int index=0;

	
	
	
	public void 등록하기() {
		
		System.out.println("학생이름");
		String name = sc.next();
		
		System.out.println("국어");
		int kor  = sc.nextInt();
		
		System.out.println("영어");
		int eng = sc.nextInt();
		
		Student s  = new Student( name, kor, eng);
		list[index]=s;		
		index++;
	}
	
	
	
	public void  조회하기() {
		for( int i=0; i< index ; i++) {
			System.out.println(( i+1) +  list[i].toString());
		}
	}
	
	
	
	public void 성적처리() {
		for( int i=0; i<index ;i++) {
			list[i].calc();
		}	
	}
	
	
	
	public void 변경하기() {
		for( int i=0; i< index ; i++) {
			System.out.println(( i+1) +  list[i].toString());
		}
		
		System.out.println("변경할 학생번호를 선택하시오");
		int updateIndex = sc.nextInt();  //1
		updateIndex= updateIndex -1;
		
		System.out.println("변경할 국어점수 입력하시오");
		int newKor  = sc.nextInt();				
		Student search =list[updateIndex];
		search.setKor(newKor);
		System.out.println("변경되었습니다");
	}
	
	
	
	
	public void run() {
		
		loop: while( true) {
			System.out.println("1.등록   2.조회  3.성적처리   4. 종료   5.변경 ");			
			int menu = sc.nextInt();
			
			
			switch( menu){
			case 1:
				등록하기();
				break;
				
				
			case  2:
				조회하기();
				break;
				
			case  3:
				성적처리();			
				break;
				
			case 4:
				break loop;
				
			case  5:
				
				변경하기();
				break;
			
			default:
				System.out.println("메뉴가 잘못");
			}
		}  // while
	}
	
	
	
	
	public static void main(String[] args) { 
		
		학생관리프로그램4  program  = new 학생관리프로그램4();
		program.run();

	} //main
	
	

}
