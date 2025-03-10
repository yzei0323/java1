package day16.prac.io;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) {
		
		
		//데헷 이거 치다말았음
		
		//표준입출력(키보드, 모니터)
		//static 제공
		//System.in
		//System.out

		
		//read()
		//키보드로부터 입력한 내용을 한 바이트씩 읽어옴
		
		try {
			int result = System.in.read();
			System.out.println(result);
		
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
