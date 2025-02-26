package day09.practice;

public class 실습3 {
	
	//3. 학생성적을 담을 class 작성하기
	
	String name;
	int kor;
	int eng;
	int avg;
	
	
	public void 입력(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	public void calc() {
		avg= (kor+eng)/2;
	}
	
	public void  출력() {
		System.out.println("학생이름: "+this.name);
		System.out.println("국어: "+this.kor);
		System.out.println("영어: "+this.eng);
		System.out.println("평균: "+this.avg);
	}
}
