package day16.prac.io.file;

public class Score {

	String name;
	int kor;
	
	
	//생성자
	public Score() {
		
	}
	
	public Score(String name, int kor) {
		super();
		this.name = name;
		this.kor = kor;
	}

	
	//toString();
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + "]";
	}

	
	//getter, setter

	
}
