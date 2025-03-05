package day11.학생;

public class 김유민_Book출력배열 {

	public static void main(String[] args) {
		
		김유민_Book [] b = new 김유민_Book[3];
		b[0] = new 김유민_Book("코스모스", "칼세이건", 38000);
		b[1] = new 김유민_Book("사피엔스", "유발 하라리", 29000);
		b[2] = new 김유민_Book("위대한 겟츠비", "피츠제럴드", 18000);
		
		for(int i=0; i<b.length; i++) {
			
			System.out.println(b[i].toString());
			
		}

	}

}
