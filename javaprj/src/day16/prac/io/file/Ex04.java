package day16.prac.io.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex04 {

	public static void main(String[] args) {
	
		
		try(FileInputStream fis = new FileInputStream("res/input.txt")) {
			
			int data = fis.read();
			System.out.print((char)data);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
	}

}
