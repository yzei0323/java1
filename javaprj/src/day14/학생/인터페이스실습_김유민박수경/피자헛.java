package day14_0306_인터페이스실습1;

public class  피자헛 implements OrderInfo{

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
