package day11.객체만들어보기;

import java.util.Arrays;

public class Chat {
	private String[] member;
	private int chatId;
	private Log[] log;

	public Chat(String[] member, int chatId) {
		super();
		this.member = member;
		this.chatId = chatId;
	}

	public int getChatId() {
		return this.chatId;
	}

	public void makeLog(String sender, String content) {
		Log[] newLog;
		if (log != null) {
			newLog = new Log[log.length + 1];
			for (int i = 0; i < log.length; i++) {
				newLog[i] = log[i];
			}
		} else {
			newLog = new Log[1];
		}
		newLog[newLog.length - 1] = new Log(sender, content);
		this.log = newLog;
	}

	public void printLog() {
		if (this.log == null) {
			System.out.println("채팅기록이 없습니다.");
			return;
		}
		System.out.println("참여자" + Arrays.toString(this.member));
		System.out.println("====================");
		for (Log item : log) {
			System.out.println(item.toString());
		}
		System.out.println("====================");
	}
}
