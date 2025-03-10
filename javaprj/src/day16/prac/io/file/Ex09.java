package day16.prac.io.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Ex09 {

	public static void main(String[] args) {
	
		
		ArrayList<Score> list = new ArrayList<>();
		
		//파일을 읽어서 Score 객체로 만들고 list에 추가

		
		try (BufferedReader br = new BufferedReader(new FileReader("res/acornScore.txt"))){
			
			while(true) {
				String line = br.readLine(); //권지언,100
				if(line == null) break;
				
				String[] data = line.split(",");
				
				String name = data[0];
				int kor = Integer.parseInt(data[1]);
			
				Score s = new Score(name, kor);
				list.add(s);
			}
			
			
			//전체 조회
			for(Score score : list) {
				System.out.println(score);
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
