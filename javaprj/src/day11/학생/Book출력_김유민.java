package day11.학생;

public class Book출력_김유민 {

	public static void main(String[] args) {
		
		Book_김유민 b1 = new Book_김유민("코스모스", "칼세이건", 38000);
		Book_김유민 b2 = new Book_김유민("사피엔스", "유발 하라리", 29000);
		Book_김유민 b3 = new Book_김유민("위대한 겟츠비", "피츠제럴드", 18000);
		
		String info1 = b1.toString();
		System.out.println(info1);
		String info2 = b2.toString();
		System.out.println(info2);
		String info3 = b3.toString();
		System.out.println(info3);
		
		

	}

}
