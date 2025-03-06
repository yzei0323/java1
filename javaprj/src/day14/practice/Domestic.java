package day14.practice;

public class Domestic implements Delivery{

	String name;
	int size;
	String locate;
	
	
	public Domestic(String name, int size, String locate) {
		this.name = name;
		this.size = size;
		this.locate = locate;
	}

	
	@Override
	public void move() {
		System.out.println("국내배송은 배송기간이 이틀 걸립니다");
		if(size >= 10) {
			System.out.println("기간이 오래 걸립니다");
		}else if(size > 0 && size < 10){
			System.out.println("");
		}
		
		
		
		
	}
}
