package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 파일복사3 {

	public static void main(String[] args) {
		
		
		long startTime = System.currentTimeMillis(); // 시작 시간 측정
		
		try (FileInputStream f = new FileInputStream("res/image.jpg");
				FileOutputStream o = new FileOutputStream("res/imagecopy2.jpg")) {
			
			while(true) {
				int data = f.read();
				if(data == -1) break;	//파일의 끝이면 종료되게
				
				o.write((data));
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
        long endTime = System.currentTimeMillis(); // 종료 시간 측정
        long elapsedTime = endTime - startTime; // 경과 시간 계산
        
        System.out.println("파일 복사 시간: " + elapsedTime + "밀리초");
		
	}

}
