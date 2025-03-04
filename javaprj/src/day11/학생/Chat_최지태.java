package day11.학생;

import java.util.Arrays;

public class Chat_최지태 {
	private String[] member;
	private int chatId;
	private Log_최지태[] log;

	public Chat_최지태(String[] member, int chatId) {
		super();
		this.member = member;
		this.chatId = chatId;
	}

	public int getChatId() {
		return this.chatId;
	}

	public void makeLog(String sender, String content) {
		Log_최지태[] newLog;
		if (log != null) {
			newLog = new Log_최지태[log.length + 1];
			for (int i = 0; i < log.length; i++) {
				newLog[i] = log[i];
			}
		} else {
			newLog = new Log_최지태[1];
		}
		newLog[newLog.length - 1] = new Log_최지태(sender, content);
		this.log = newLog;
	}

	public void printLog() {
		if (this.log == null) {
			System.out.println("채팅기록이 없습니다.");
			return;
		}
		System.out.println("참여자" + Arrays.toString(this.member));
		System.out.println("====================");
		for (Log_최지태 item : log) {
			System.out.println(item.toString());
		}
		System.out.println("====================");
	}
}
