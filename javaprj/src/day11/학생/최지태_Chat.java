package day11.학생;

import java.util.Arrays;

public class 최지태_Chat {
	private String[] member;
	private int chatId;
	private 최지태_Log[] log;

	public 최지태_Chat(String[] member, int chatId) {
		super();
		this.member = member;
		this.chatId = chatId;
	}

	public int getChatId() {
		return this.chatId;
	}

	public void makeLog(String sender, String content) {
		최지태_Log[] newLog;
		if (log != null) {
			newLog = new 최지태_Log[log.length + 1];
			for (int i = 0; i < log.length; i++) {
				newLog[i] = log[i];
			}
		} else {
			newLog = new 최지태_Log[1];
		}
		newLog[newLog.length - 1] = new 최지태_Log(sender, content);
		this.log = newLog;
	}

	public void printLog() {
		if (this.log == null) {
			System.out.println("채팅기록이 없습니다.");
			return;
		}
		System.out.println("참여자" + Arrays.toString(this.member));
		System.out.println("====================");
		for (최지태_Log item : log) {
			System.out.println(item.toString());
		}
		System.out.println("====================");
	}
}
