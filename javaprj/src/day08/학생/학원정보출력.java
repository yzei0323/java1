package day08.학생;

import java.util.Scanner;

public class 학원정보출력 {
	public static void main(String[] args) {
		School a = new School();
		
		a.name = "에이콘아카데미";
		a.type = "개발";
		a.address = "서울 서대문구";
		
		print(a);
	}
	public static void print(School a) {
		System.out.println("학원 이름: " + a.name);
		System.out.println("분야: " + a.type);
		System.out.println("주소: " + a.address);
	}
}