package day21.chatt.실습;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client2 {

	Socket socket;	// 통신할 소켓 - 기반스트림(들어오는 길, 나가는 길)
	
	DataInputStream dis;
	DataOutputStream dos;
	Scanner sc = new Scanner(System.in);
	
	
	public Client2() {
		
		// 서버 ip, 포트번호
		// 
		try {
			socket = new Socket("192.168.100.40", 6100);
			
			dis = new DataInputStream(socket.getInputStream());
			dos = new DataOutputStream(socket.getOutputStream());
			
			//보내기
			sendMsg();
			
			//받기
			recvMsg();
			
			
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	private void recvMsg() {
		
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					while(true) {
						String msg = dis.readUTF();
						System.out.println(msg);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		th.start();
		
		/*
		try {
			String msg = dis.readUTF();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

	private void sendMsg() {
		
		Thread th = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					while(true) {
						String msg = sc.nextLine();
						dos.writeUTF(msg);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}});
		th.start();
		
		/*
		try {
			String msg = sc.nextLine();
			dos.writeUTF(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}




	public static void main(String[] args) {
		
		new Client2();

	}

}
