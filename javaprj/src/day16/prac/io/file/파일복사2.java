package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사2 {

	public static void main(String[] args) {
		
		
		//이미지 파일 복사하기
		
		//입력스트림(바이트 기반 스트림)
		//출력스트림(바이트 기반 스트림)
		
		//FileInputStream
		//FileOutputStream
		
		try {
			FileInputStream f = new FileInputStream("res/image.jpg");
			FileOutputStream o = new FileOutputStream("res/imagecopy.jpg");
			while(true) {
				int data = f.read();
				if(data == -1) break;
				o.write(data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
