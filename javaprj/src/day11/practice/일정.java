package day11.practice;

import java.util.Scanner;

//1.등록   2.조회   3.변경   4.삭제    5.종료
public class 일정 {
	
	
	Scanner sc = new Scanner(System.in);
	int date;
	String toDo;
	String where;
	String with;
	
	public 일정(int date, String with, String where, String toDo ) {
			this.date=date;
			this.with=with;
			this.where=where;
			this.toDo=toDo;
		}
	
	public void setToDo() {
		
	}

//	public 일정(int nextInt, String next, String next2, String next3) {
//		// TODO Auto-generated constructor stub
//	}
	
	
	
}
