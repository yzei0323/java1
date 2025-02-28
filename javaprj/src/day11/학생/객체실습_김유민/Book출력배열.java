package day10실습;

public class Book출력배열 {

	public static void main(String[] args) {
		
		Book [] b = new Book[3];
		b[0] = new Book("코스모스", "칼세이건", 38000);
		b[1] = new Book("사피엔스", "유발 하라리", 29000);
		b[2] = new Book("위대한 겟츠비", "피츠제럴드", 18000);
		
		for(int i=0; i<b.length; i++) {
			
			System.out.println(b[i].toString());
			
		}

	}

}
