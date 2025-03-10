package day15.정렬;

//public class Score extends Object{
public class Score implements Comparable {
	String name;
	int kor;
	int eng;
	double avg;
	
	
	//생성자 오버로딩(매개변수가 다른 여러개의 생성자를 말한다)
	public Score() {
		
	}
	
	
	//생성자(특별한 매서드)
	public Score(String name, int kor, int eng) {
		//super();  //부모의 기본생성자를 생성하는게 루틴입니다 기본이에요 예예
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		
		calcAvg();
	}
	
	private void calcAvg() {
		int total = kor+eng;
		avg = total/2;
	}
	
	
	//매서드
	
	//toString()
	@Override
	public String toString() {
		return "[name="+name+", kor="+kor+", eng="+eng+", avg="+avg+"]";
	}


	@Override
	public int compareTo(Object o) {
		Score score = (Score)o;	//
	
		return this.kor - score.kor ;	//기준이 크면 양수가 전달되나요?? 기준이 작으면 음수가 전달되나요?
	}

}	
