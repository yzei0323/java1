package day14.practice;

import java.util.Scanner;

public class DeliveryMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Delivery.product();
		System.out.println("구매하실 보조배터리 개수를 입력하세요.");
		int cnt = sc.nextInt();
		
		System.out.println("배송받을 주소를 입력하세요");
		String address = sc.next();
		
		
		int total = 21000 * cnt;
		
		Delivery delivery;
		
		if(address.contains("서울")) {
			delivery = new Domestic(cnt, address);
			System.out.println("국내배송");
		}else {
			delivery = new Overseas(cnt, address);
			System.out.println("해외배송");
		}

		delivery.transport();
		int deliveryFee = delivery.getDeliveryFee();
		int deliveryTime = delivery.getDeliveryTime();
		int totalPrice = total+deliveryFee;
		
		
		System.out.println("샤오미 보조배터리"+" "+cnt+"개");
		System.out.println("배송주소: "+address);
		System.out.println("배송기간: "+deliveryTime+"일");
		System.out.println("배송비: "+deliveryFee+"원");
		System.out.println("총 가격: "+totalPrice+"원");
	}

}
