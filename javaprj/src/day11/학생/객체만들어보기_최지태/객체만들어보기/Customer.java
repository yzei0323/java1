package day11.객체만들어보기;

public class Customer {
	private String id;
	private String pw;
	private String name;
	private int[] myChat;

	public Customer(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}

	public void addChat(int chatId) {
		int[] newMyChat = null;
		if (myChat != null) {
			newMyChat = new int[myChat.length + 1];
			for (int i = 0; i < myChat.length; i++) {
				newMyChat[i] = myChat[i];
			}
		} else {
			newMyChat = new int[1];
		}
		newMyChat[newMyChat.length - 1] = chatId;
		myChat = newMyChat;
	}

	public boolean checkId(String id) {
		return this.id.equals(id);
	}
	
	public boolean checkLogin(String id, String pw) {
		return id.equals(this.id) && pw.equals(this.pw);
	}

	public void printMychat() {
		System.out.println("참여중인 채팅방 번호");
		for (int item : myChat) {
			System.out.print(item + " | ");
		}
	}
}
