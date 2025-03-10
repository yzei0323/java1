package chap_08_interFace.Day00.Ex03;

public class TV implements HomeControl {

	@Override
	public void turnOn() {

		System.out.println("TV가 켜졌습니다.");
	}

	@Override
	public void turnOff() {

		System.out.println("TV가 꺼졌습니다.");
	}

	@Override
	public void timer() {
		// TODO Auto-generated method stub
		
	}

}
