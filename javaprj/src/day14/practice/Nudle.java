package day14.practice;

import java.util.Scanner;

public class Nudle implements exInterface{

	@Override
	public void product() {
		String[] nudle = new String[] {"열라면","진라면","신라면","불닭볶음면"};
		int[] price = new int[] {2680, 2700, 3960, 4310};	
		
		for(int i=0; i<nudle.length; i++) {
			System.out.print(i+1+"."+nudle[i]+"  ");
		}
		
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 라면 선택");
		int nudleNo = sc.nextInt();
		System.out.println(nudle[nudleNo-1]+"은 "+price[nudleNo-1]+"원입니다. 몇 개 구매하실 건가요?");
		int nudleCnt = sc.nextInt();
		int nudleTot = price[nudleNo-1]*nudleCnt;
		
		
		int total = nudleTot;
		System.out.println(nudleTot);
			
	}

	@Override
	public void count() {
		
		
	}

	
}
