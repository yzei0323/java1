package day04;

import java.util.Scanner;

public class Scanner사용하기 {

	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in); 
		
		String name;
		int kor;
		int eng;
		double avg;
		
		
		name = sc.nextLine();
		kor = Integer.parseInt(sc.nextLine());	//"90" -> 90
		eng = Integer.parseInt(sc.nextLine());
		avg = Double.parseDouble(sc.nextLine()); //"98.56" -> 98.56
		
		System.out.println(name);
		System.out.println(kor);
		System.out.println(eng);
		System.out.println(avg);
		
	}

}
