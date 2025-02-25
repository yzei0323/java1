package day07;

public class 배열에출력하기 {

	public static void main(String[] args) {
		
		
		int[] arr = new int[] {10,20,30,40};
		
		//
		
		//배열을 출력하는 코드 함수로 만들기
		/*
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		*/

		//
		배열출력하기(arr); 	//배열의 주소가 전달됨(주소가 전달되는 것을 call by reference)
		배열출력하기(arr);
		배열출력하기(arr);
	}

	
	//
	public static void 배열출력하기(int[] arr) {
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
	}
}
