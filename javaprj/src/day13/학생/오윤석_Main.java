package day13.학생;

public class 오윤석_Main {

	public static void main(String[] args) {

		System.out.println("=====기본출력=====");
		오윤석_Music music = new 오윤석_Music();
		오윤석_Movie movie = new 오윤석_Movie();
		오윤석_Radio radio = new 오윤석_Radio();

		오윤석_Content a1 = music;
		a1.play();
		오윤석_Content a2 = movie;
		a2.play();
		오윤석_Content a3 = radio;
		a3.play();

		System.out.println("\n=====배열출력=====");
		오윤석_Content[] contents = new 오윤석_Content[3];
		contents[0] = music;
		contents[1] = movie;
		contents[2] = radio;

		for (오윤석_Content content : contents) {
			content.play();
		}

		System.out.println("\n=====업캐스팅=====");
		오윤석_Content content = new 오윤석_Music(); // Music을 Content로 업캐스팅
		content.play();

		System.out.println("\n=====다운캐스팅=====");
		오윤석_Content content1 = new 오윤석_Music(); // Music을 Content로 업캐스팅 -> 자식객체를 부모타입으로 업캐스팅
		오윤석_Music music1 = (오윤석_Music) content1;
		music1.play();

		System.out.println("\n=====올바르지 않은 다운캐스팅=====");
		오윤석_Movie movie1 = (오윤석_Movie) content; // 업캐스팅 하지 않은 채 Content에서 Movie로 다운캐스팅
		movie1.play();

	}

}
