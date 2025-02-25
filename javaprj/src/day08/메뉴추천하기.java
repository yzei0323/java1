package day08;

public class 메뉴추천하기 {

	public static void main(String[] args) {

		String result = 메뉴추천하기();
		System.out.println(result);
		
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
