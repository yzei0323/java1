package day10.학생관리;

public class Student {

	//속성, 필드
	//인스턴스변수
	private String name;
	private int kor;
	private int eng;
	private int total;
	private double avg;
	private char grade;
	
	
	//생성자
	
	public Student() {
		//매개변수가 없는 생성자는 기본생성자
	}
	
	 
	//매개변수가 있는 생성자
	public Student(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}
	
	
	public String toString() {
		return name +" "+ kor +" "+ eng +" "+ avg +" "+ grade;
	}
	
	
	private void calcAvg() {
		int total = kor + this.eng;
		this.avg = total/2.0;
	}
	
	private void calcGrade() {
		if(avg>=90) {
			grade = 'A';
		}else if(avg>=80) {
			grade = 'B';
		}else if(avg>=70) {
			grade = 'C';
		}else {
			grade = 'F';
		}
	}

	public void calc() {
		calcAvg();
		calcGrade();
	}

	
	//국어점수를 변경할 메서드
	public void setKor(int kor) {
		
		this.kor = kor;
	}

}


