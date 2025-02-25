package day08.학생;

public class 영화정보출력하기 {

	public static void main(String[] args) {
		
		Disney zoo = new Disney();
		zoo.title = "주토피아";
		zoo.title_eng = "Zootopia";
		zoo.release = "2016.02.17";
		zoo.rating = 9.33;
		zoo.viewers = 471;

		printInfo(zoo);
		
	}

	public static void printInfo(Disney zoo) {
		System.out.println(zoo.title);
		System.out.println("영화 " + zoo.title_eng);
		System.out.println("개봉 " + zoo.release);
		System.out.println("평점 " + zoo.rating);
		System.out.println("관객 " + zoo.viewers + "만명");
	}
	
}
