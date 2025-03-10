package day14.학생.윤현기최하은;


public class 윤현기최하은_Aircon implements 윤현기최하은_HomeControl {
	// 실제 에어컨은 꺼져있으니깐 false값으로 지정
	private boolean isPowerOn = false;  // 에어컨 상태 체크용

	@Override
	public void turnOn() {
		if (!isPowerOn){ // 전원이 켜졌을떄 == true
			isPowerOn = true; // ⭐️전원값 == true로 바꿈
			System.out.println("에어컨이 켜졌습니다.");
			try {
				// 시작할 때 로딩 효과
				System.out.print("시원한 바람 준비중");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(300);
					System.out.print(".");
				}
				System.out.println("\n");

				// 바람 나오는 효과
				for (int i = 0; i < 3; i++) {
					System.out.println("∽∽∽ ❄️ ∽∽∽");
					Thread.sleep(500);
					System.out.println(" ∽∽∽ ❄️ ∽∽∽");
					Thread.sleep(500);
					System.out.println("  ∽∽∽ ❄️ ∽∽∽");
					Thread.sleep(500);
				}

				// 온도 표시
				System.out.println("\n현재 온도: 18°C");
				System.out.println("시원한 바람이 나오고 있습니다 ❄️");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("이미 에어컨이 켜져 있습니다.");
		}

	}

	@Override
	public void turnOff() {
		if (isPowerOn){ // 전원이 꺼질떄 == false
			isPowerOn = false; // ⭐전원값 false로 바꿈
			try {
				// 바람이 점점 약해지는 효과
				System.out.println("\n바람 세기가 줄어듭니다...");
				System.out.println("∽∽∽ ❄️ ∽∽∽");
				Thread.sleep(700);
				System.out.println(" ∽∽ ❄️ ∽∽");
				Thread.sleep(700);
				System.out.println("  ∽ ❄️ ∽");
				Thread.sleep(700);

				// 온도 변화 표시
				System.out.println("\n실내 온도 변화");
				System.out.println("18°C → 19°C → 20°C");

				// 종료 메시지
				System.out.print("\n에어컨 종료중");
				for (int i = 0; i < 3; i++) {
					Thread.sleep(300);
					System.out.print(".");
				}
				System.out.println("\n에어컨이 꺼졌습니다.");

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			System.out.println("에어컨이 이미 꺼져 있습니다.");
		}
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	@Override
	public void timer() {
		// 타이머 상태 체크만 하고 실제 타이머는 실행하지 않음
		if (!isPowerOn) {
			System.out.println("에어컨이 꺼져 있어 타이머를 설정할 수 없습니다.");
		}
	}

}
