package day09.학생성적;

public class Student4 {

	private String name;
	private int kor; 
	private int eng;
	private int total;
	private double avg;
	
	
	//입력하기
	public void input(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	//성적처리하기
	private void calcTotal() {
		total = kor + eng;
	}
	
	//성적처리 평균구하기
	public void cal() {
		calcTotal();
		avg = total / 2.0;
	}
	
	//출력하기
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.kor);
		System.out.println(this.eng);
		System.out.println(this.total);
		System.out.println(this.avg);
	}
}
