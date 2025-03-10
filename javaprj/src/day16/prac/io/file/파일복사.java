package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class 파일복사 {

	public static void main(String[] args) {
		
		
		//이미지 파일 복사하기
		
		//입력스트림(바이트 기반 스트림)
		//출력스트림(바이트 기반 스트림)
		
		//FileInputStream
		//FileOutputStream
		
		
		try {
			FileInputStream f = new FileInputStream("res/image.jpg");
			FileOutputStream o = new FileOutputStream("res/imgagecopy.jpg");
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
		}
		
		
/*		try {
			FileInputStream f = new FileInputStream("res/image.jpg");
			FileOutputStream o = new FileOutputStream("res/imagecopy.jpg");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if
		}


	*/
	}
}

