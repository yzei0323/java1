package day04;

public class 제어문_continue {

	public static void main(String[] args) {
		
		
		//반복문에서 특정조건일 때 아래코드를 수행하지 않고 다음 반복으로 넘어가게 해줌
		//홀수합을 구하기 continue를 사용하여 구하기
		
		// 1 3 5 7 9
		
		int odd_sum=0;
		for(int i=1; i<=10; i++) {
			
			//i의 값이 짝수라면 홀수합에 더해지지 않도록 하기
			if(i % 2 == 0) {
				continue;
			}
			
			odd_sum = odd_sum + i;
		}

	}

}
