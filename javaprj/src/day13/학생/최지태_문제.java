package day13.학생;

public class 최지태_문제 {
	protected String 문제내용;
	protected int 정답;

	public 최지태_문제(String 문제내용, int 정답) {
		this.문제내용 = 문제내용;
		this.정답 = 정답;
	}

	public void 문제출력() {
		System.out.println("========================================");
		System.out.println(문제내용);
		System.out.println("========================================");
	}

	public void 선택지출력() { // 상속 주려고 만든거
	}

	public boolean 정답인가(int 정답) {
		return this.정답 == 정답;
	}

	public boolean 정답인가(String 답) { // 주관식문제 상속 주려고 만든거
		return false;
	}
}

class 객관식문제 extends 최지태_문제 {
	protected String[] 선택지;

	public 객관식문제(String 문제내용, int 정답, String[] 선택지) {
		super(문제내용, 정답);
		this.선택지 = 선택지;
	}

	@Override
	public void 선택지출력() {
		for (int i = 0; i < 선택지.length; i++) {
			System.out.println((i + 1) + "번 " + 선택지[i]);
		}
		System.out.println("========================================");
	}
}

class OX문제 extends 최지태_문제 {
	public OX문제(String 문제내용, int 정답) {
		super(문제내용, 정답);
	}

	@Override
	public void 선택지출력() {
		System.out.println("1.O, 2.X");
		System.out.println("========================================");
	}
}

class 주관식문제 extends 최지태_문제 {
	protected String 정답;

	public 주관식문제(String 문제내용, String 정답) {
		super(문제내용, -1);
		this.정답 = 정답;
	}

	@Override
	public void 선택지출력() {
		System.out.println("====================");
		System.out.println("서술형 문제 입니다. 입력해주세요.");
		System.out.println("====================");
	}

	@Override
	public boolean 정답인가(String 정답) {
		return this.정답.equals(정답);
	}

}