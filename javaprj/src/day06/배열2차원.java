package day06;

public class 배열2차원 {

	public static void main(String[] args) {
		
		
		//2차원배열 : 1차원배열의 요소로 가지는 배열이다
		
		int[][] arr = new int[2][3];	//
		
		
		/*
			2  4   6
			8  10  12
		*/
		
		
		arr[0][0]=2;
		arr[0][1]=4;
		arr[0][2]=6;
		
		arr[1][0]=8;
		arr[1][1]=10;
		arr[1][2]=12;
		
		
		int[][] arr2 = new int[][] {
			{2,4,6},
			{8,10,12}
		};

		
		int[][] arr3 = {
				{2,4,6},
				{8,10,12}
		};
		
	}

}
