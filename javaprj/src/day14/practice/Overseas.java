package day14.practice;

public class Overseas implements Delivery{

	private int cnt;
	private String address;
	
	
	public Overseas(int cnt, String address) {
		this.cnt = cnt;
		this.address = address;
	}

	@Override
	public void transport() {	//운송수단
		System.out.println("해외배송은 비행기로 운송됩니다");
	}

	@Override
	public int getDeliveryFee() {	//배송비
		return 0;
	}


	@Override
	public int getDeliveryTime() {		//배송기간
		if(address.contains("미국")) {
			return 10;
		} else if(address.contains("유럽")) {
			return 14;
		}else {
			return 21; //나머지지역
		}
	}
}
