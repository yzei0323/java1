package day11.객체만들어보기;

import java.util.Random;
import java.util.Scanner;

public class 채팅프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer[] customers = null;
		Chat[] chat = null;

		run(sc, customers, chat);
	}

	public static void run(Scanner sc, Customer[] customers, Chat[] chats) {
		System.out.println("채팅 시스템");
		while (true) {
			System.out.println("1. 로그인, 2. 회원가입, 3.끝내기");
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				System.out.println("로그인 하기");
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				Customer customer = login(customers, id, pw);
				if (customer != null) {
					System.out.println("로그인 성공");
					System.out.println(customer.getName() + "님 환영합니다.");
					chats = chatMenu(sc, customer, customers, chats);
				} else {
					System.out.println("아이디 비밀번호를 확인해주세요");
				}
				break;
			}
			case 2: {
				System.out.println("회원가입");
				System.out.print("이름 입력 : ");
				String name = sc.next();
				System.out.print("아이디 입력 : ");
				String id = sc.next();
				System.out.print("비밀번호 입력 : ");
				String pw = sc.next();
				customers = singup(customers, name, id, pw);
				break;
			}
			case 3: {
				System.out.println("종료 하기");
				return;
			}
			}
		}
	}

	public static Customer login(Customer[] customers, String id, String pw) {
		if (customers == null) {
			return null;
		}
		for (Customer c : customers) {
			if (c.checkLogin(id, pw))
				return c;
		}
		return null;
	}

	public static Customer[] singup(Customer[] customers, String name, String id, String pw) {
		Customer[] newCustomers;
		if (customers != null) {
			newCustomers = new Customer[customers.length + 1];
			for (int i = 0; i < customers.length; i++) {
				newCustomers[i] = customers[i];
			}
		} else {
			newCustomers = new Customer[1];
		}
		newCustomers[newCustomers.length - 1] = new Customer(id, pw, name);
		return newCustomers;
	}

	public static Chat[] chatMenu(Scanner sc, Customer customer, Customer[] customers, Chat[] chats) {
		while (true) {
			System.out.println("1. 채팅방 만들기, 2. 채팅하기, 3. 나가기");
			int input = sc.nextInt();
			switch (input) {
			case 1: {
				System.out.println("채팅방 만들기");
				System.out.print("초대할 사람의 아이디를 입력하세요 : ");
				String id = sc.next();
				Customer member = findCustomer(id, customers);
				if (member == null) {
					System.out.println("아이디를 확인해 주세요.");
					break;
				} else {
					chats = makeChat(new String[] { customer.getName(), member.getName() }, chats);
					customer.addChat(chats[chats.length - 1].getChatId());
					member.addChat(chats[chats.length - 1].getChatId());
					System.out.println("채팅방 생성 완료");
				}
				break;
			}
			case 2: {
				customer.printMychat();
				System.out.print("\n입장할 채팅방으로 선택 하세요 : ");
				int chatId = sc.nextInt();
				Chat chat = fintChat(chatId, chats);
				if (chat != null) {
					chatRoom(customer.getName(), chat, sc);
				}
				break;
			}
			case 3: {
				return chats;
			}
			}
		}
	}

	public static Chat fintChat(int chatId, Chat[] chats) {
		if (chats == null) {
			return null;
		}
		for (Chat item : chats) {
			if (chatId == item.getChatId()) {
				return item;
			}
		}
		System.out.println("입력을 다시 해주세요");
		return null;
	}

	public static void chatRoom(String name, Chat chat, Scanner sc) {
		while (true) {
			chat.printLog();
			while (true) {
				System.out.print("보낼 메시지 입력 (0 입력하면 종료.) : ");
				String content = sc.next();
				if (content.equals("0")) {
					return;
				} else {
					chat.makeLog(name, content);
				}
			}

		}
	}

	public static Customer findCustomer(String id, Customer[] customers) {
		for (Customer c : customers) {
			if (c.checkId(id)) {
				return c;
			}
		}
		return null;
	}

	public static int makeChatID() {
		Random r = new Random();
		return r.nextInt(10000);
	}

	public static Chat[] makeChat(String[] members, Chat[] chats) {
		Chat[] newChat;
		int chatId = makeChatID();
		if (chats != null) {
			newChat = new Chat[chats.length + 1];
			for (int i = 0; i < chats.length; i++) {
				newChat[i] = chats[i];
			}
		} else {
			newChat = new Chat[1];
		}
		newChat[newChat.length - 1] = new Chat(members, chatId);
		return newChat;
	}
}
