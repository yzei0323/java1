package day14.학생.김유민박수경;

public class 김유민박수경_도미노 implements 김유민박수경_OrderInfo{

	@Override
	public String topping(String topping1, String topping2) {
		System.out.println("토핑은: " );
		return topping1 + topping2;
	}
	
	@Override
	public String side(String side1, String side2) {
		System.out.println("추가주문메뉴는: " );
		return side1 + side2;
	}
}
