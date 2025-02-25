package com.acorn.hyj;


public class HYJTest {

	public static void main(String[] args) {
		
		int result = HYJ.약수개수(16);
		System.out.println(result);

		
		int[] factor = HYJ.약수(16);
		for(int result2 : factor) {
			if(result2!=0) {
				System.out.print(result2+" ");
			}
		}
		System.out.println("");
		
		
		int result3 = HYJ2.약수(15);
		System.out.println(": "+result3+"개");	
		
	}

}
