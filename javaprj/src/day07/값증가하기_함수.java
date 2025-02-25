package day07;

public class 값증가하기_함수 {

	public static void main(String[] args) {
	
		
		int index=0;
		index=증가하기(index);
		System.out.println(index);
		index=증가하기(index);
		System.out.println(index);
		index=증가하기(index);
		System.out.println(index);
	}

	/*
		기능: 수를 1 증가하기
		입력: 점수 하나
		반환: 증가된 값
	*/
	
	public static int 증가하기(int num) {
		num++;
		return num;
	}
}
