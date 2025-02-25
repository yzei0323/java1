package day08;

public class 배열의합구하기 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {70,88,100,89,95};
		
		int sum=0;

		sum = sum + arr[0];
		sum = sum + arr[1];
		sum = sum + arr[2];
		sum = sum + arr[3];
		sum = sum + arr[4];
		
		System.out.println(sum);
	
	
		//배열의 합 함수호출하기
		
		int result = 배열의합구하기(arr);
		System.out.println(result);
		
		int result2 = 배열의가장큰값구하기(arr);
		System.out.println(result2);
	}

	//배열의 합을 반환하는 함수 만들기
	//기능: 배열의 합 구하기
	//입력: 배열
	//반환: 배열 요소의 합계
	
	public static int 배열의합구하기(int[] arr) {
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];
		}
		return sum;
	}
	
	
	//배열에서 가장 큰 값 반환하기
	public static int 배열의가장큰값구하기(int[] arr) {
		int max=arr[0];
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	
	//기능: 메뉴추천 기능
	//입력: 없다
	//반환: 임의의 메뉴
	
	public static String 메뉴추천하기() {
		
		String[] menu = new String[] {"돈까스","제육","짜장면","카레라이스","우동","김밥"};
						// 1미만의 임의의 실수형 데이터 0~5
		int index = (int) (Math.random() * menu.length);
		
		String result = menu[index];
		return result;
	}
	
}

	
