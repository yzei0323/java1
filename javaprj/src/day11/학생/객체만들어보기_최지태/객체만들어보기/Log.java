package day11.객체만들어보기;

import java.util.Calendar;

public class Log {
	String sander;
	String content;
	String date;

	public Log(String sander, String content) {
		super();
		this.sander = sander;
		this.content = content;
		getNow();
	}

	private void getNow() {
		Calendar cal = Calendar.getInstance(); // 현재 날짜와 시간을 얻기 위한 Calendar 객체 생성
		String date = String.format("%02d/%02d %02d:%02d", //
				cal.get(Calendar.MONTH) + 1, // 현재 월 (0부터 시작하므로 1을 더함)
				cal.get(Calendar.DATE), // 현재 날짜
				cal.get(Calendar.HOUR_OF_DAY), // 현재 시각 (24시간 형식)
				cal.get(Calendar.MINUTE)); // 현재 분
		this.date = date;
	}

	public String toString() {
		return date + "\t" + sander + "\t" + content;
	}
}
