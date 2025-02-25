package day08.학생;

public class 스낵정보출력_이동우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub



		스낵정보_이동우 store = new 스낵정보_이동우();
		스낵정보_이동우 store2 = new 스낵정보_이동우();
		
		snack(store);
		
		System.out.println("================");
		
		drink(store2);
	}
	
	public static void snack(스낵정보_이동우 store) {
		
		store.type = "과자";
		store.name = "홈런볼";
		store.amount = 1700;
		
		System.out.println("종류 : " + store.type);
		System.out.println("이름 : " + store.name);
		System.out.println("가격 : " + store.amount + "원");
		

		
	
		
	}
	
	public static void drink( 스낵정보_이동우 store2) {
		
		store2.type = "음료수";
		store2.name = "밀키스";
		store2.amount = 2200;
		
		
		System.out.println("종류 : " + store2.type);
		System.out.println("이름 : " + store2.name);
		System.out.println("가격 : " + store2.amount + "원");
	}
}
