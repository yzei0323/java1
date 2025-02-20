package day04;

public class 임형택_피보나치_배열사용 {

	public static void main(String[] args) {
		
		//동일한 기억장소를 연속적으로 확보하여 사용하는 거
		//배열
		
		long[] fibo = new long[50];
		
		
		fibo[0]=1;
		fibo[1]=1;
		
		//배열의 요소의 3번째 구하기
		for(int i=2; i<50; i++) {
			fibo[i] = fibo[i-1] + fibo[i-2];
		}
		
		//반복문을 사용하여 배열 출력하기
		for(int i=0; i<fibo.length; i++) {
			System.out.print(fibo[i] + ", ");
		}
	}

}
