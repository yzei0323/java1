package day16.prac.io;

import java.io.IOException;

public class Ex02 {

	public static void main(String[] args) {
	
		
		for(int i=0; i<=5; i++) {
			try {
				int result = System.in.read();
				System.out.print((char)result);
			}catch(IOException e) {
				e.printStackTrace();
			}
		}

	}

}
