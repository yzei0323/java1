package day14.practice;

public class Overseas implements Delivery{

	String name;
	int size;
	
	
	public Overseas(String name, int size) {
		this.name = name;
		this.size = size;
	}

	
	@Override
	public void move() {
		System.out.println("해외배송은 배송기간이 한달 걸립니다");
		if(size >= 10) {
			System.out.println("배로 운송됩니다");
		}else if(size > 0 && size < 10){
			System.out.println("비행기로 운송됩니다");
		}
		
		
	}

}
