package day11.학생;

public class 김유민_Book출력 {

	public static void main(String[] args) {
		
		김유민_Book b1 = new 김유민_Book("코스모스", "칼세이건", 38000);
		김유민_Book b2 = new 김유민_Book("사피엔스", "유발 하라리", 29000);
		김유민_Book b3 = new 김유민_Book("위대한 겟츠비", "피츠제럴드", 18000);
		
		String info1 = b1.toString();
		System.out.println(info1);
		String info2 = b2.toString();
		System.out.println(info2);
		String info3 = b3.toString();
		System.out.println(info3);
		
		

	}

}
