package chap_08_interFace.Day00.Ex03;

public class Light implements HomeControl {

	@Override
	public void turnOn() {
		System.out.println("거실의 불이 켜졌습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("거실의 불이 꺼졌습니다.");
	}

	@Override
	public void timer() {
		
	}

}
