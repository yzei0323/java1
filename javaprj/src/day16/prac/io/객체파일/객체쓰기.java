package day16.prac.io.객체파일;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class 객체쓰기 {

	public static void main(String[] args) {
		
		
		Score s = new Score("홍길동",100);
		Score s2 = new Score("홍길순", 99);
		Score s3 = new Score("이길동", 69);

		
		//기반스트림 FileOutputStream
		//보조스트림 ObjectOutputStream
		
		try (ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("res/objOutput.txt"))){
			
			os.writeObject(s);
			os.writeObject(s2);
			os.writeObject(s3);
			
			os.flush();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
