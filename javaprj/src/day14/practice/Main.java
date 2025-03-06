package day14.practice;

public class Main {

	public static void main(String[] args) {

		Overseas o = new Overseas("컴퓨터", 12);
		Domestic d = new Domestic("라면", 2, "제주");
		
		o.move();
		d.move();

	}

}
