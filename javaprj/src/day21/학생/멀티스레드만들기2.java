package day21.학생;

public class 멀티스레드만들기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1 = new Car1();
		Car2 c2 = new Car2();

		c1.setDaemon(true);
		c2.setDaemon(true);

		c1.start();
		c2.start();

		int i = (int) (Math.random() * 9 + 1) % 3;
		System.out.println("랜덤상황" + i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (i == 0) {
			c1.interrupt();
		} else if (i == 1) {
			c2.interrupt();
		} else {

		}
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("경주가 끝났습니다");
		// System.out.println(c1.toString());
		// System.out.println(c2.toString());

	}

}

class Car1 extends Thread {
	String name = "car1";
	int time = (int) (Math.random() * 10) + 1;

	@Override
	public void run() {

		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			System.out.println(name + " 실격");
			return;
		}
		System.out.println(name + " 도착했습니다.");

	}

	@Override
	public String toString() {
		return name + " 걸린시간 : " + time + "초";
	}

}

class Car2 extends Thread {
	String name = "car2";
	int time = (int) (Math.random() * 10) + 1;

	@Override
	public void run() {

		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			System.out.println(name + " 실격");
			return;
		}
		System.out.println(name + " 도착했습니다.");

	}

	@Override
	public String toString() {
		return name + " 걸린시간 : " + time + "초";
	}

}