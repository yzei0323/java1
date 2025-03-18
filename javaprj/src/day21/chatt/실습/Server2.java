package day21.chatt.실습;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//서버
//서버소켓

//클라이언트 - 서버 (일대일 채팅)
public class Server2 {

	ServerSocket serverSocket;  //서버소켓
	Socket clientSocket; 	// 클라이언트와 통신할 소켓 (전화기역할-기반스트림(나가는 통로, 들어오는 통로)
							// 바이트스트림입니다
	
	//보조스트림
	DataInputStream dis;
	DataOutputStream dos;
	Scanner sc = new Scanner(System.in);
	
	
	public Server2() {
								//포트번호 (5000 ~ 9000 사이)
		try {
			serverSocket = new ServerSocket(6100);
			System.out.println("서버 기다리는 중");
			clientSocket = serverSocket.accept();
			System.out.println("서버 Start!");
			
			String clientIp = clientSocket.getInetAddress().toString();
			
			dis = new DataInputStream(clientSocket.getInputStream()); //들어오는 길
			dos = new DataOutputStream(clientSocket.getOutputStream()); //나가는 길
			
			
			//받기
			recvMsg();
			
			
			//보내기
			sendMsg();
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
			while(true) {
				String msg = sc.nextLine();
				dos.writeUTF(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
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
			while(true) {
				String msg = dis.readUTF();
				System.out.println(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}


	
	
	public static void main(String[] args) {
		
		new Server2();

	}

}
