package day14.practice;

public class Domestic implements Delivery{
	//국내배송
	
	private int cnt;
	private String address;
	
	
	public Domestic(int cnt, String address) {
		this.cnt = cnt;
		this.address = address;
	}

	
	@Override
	public void transport() { //운송수단
		System.out.println("국내배송은 트럭으로 운송됩니다");
		
	}

	@Override
	public int getDeliveryFee() { //배송비
		return 5000;
	}


	@Override
	public int getDeliveryTime() { //배송기간
		if(address.contains("경기")) {
            return 1;
        }else if (address.contains("서울")) {
            return 0;
        }else if(address.contains("제주")||address.contains("대충어디지방이거추가할게여")){
            return 5;
        }else {
        	return 3; //걍 나머지는 2일
        }
	}





}
