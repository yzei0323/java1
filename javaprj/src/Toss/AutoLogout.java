package Toss;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class AutoLogout {

	static Timer logoutTimer = new Timer();
	static final int logoutTime = 5000; //일단 5초로 해둘게용
	private static Scanner sc = new Scanner(System.in);
	
	
	public static void startTimer() {
		logoutTimer.cancel(); //기존타이머취소
		logoutTimer = new Timer(); //다시시작
		logoutTimer.schedule(new TimerTask() {
			@Override
			public void run() {
				Main.logout(null); 
				System.out.println("일정 시간동안 입력이 없어 로그아웃되었습니다.");
				}}, logoutTime);
	
	}
	
	public static void resetTimer() {
		startTimer(); //타이머다시시작
	}
	
	
	//입력 받기 전, 후 타이머 초기화
	public static String nextLine() {
		resetTimer(); //콘솔입력 전 타이머초기화
		String input= sc.nextLine();
		resetTimer(); //입력 후 타이머초기화
		return input;
	}
	
	public static int nextInt() {
		resetTimer();
		int input = Integer.parseInt(sc.nextLine());
		resetTimer();
		return input;
	}
	
	public static long nextLong() {
		resetTimer();
		long input = Long.parseLong(sc.nextLine());
		resetTimer();
		return input;
	}
	
}
