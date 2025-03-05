package day11.학생;

public class 박수경_책정보3_main {
	//3. 책정보(title,author, price)를 담을 수 있는 Book 클래스를 정의하고 책정보 3개를 객체 배열로 만들고 출력
	public static void main(String[] args) {

		박수경_책정보3[] list = new 박수경_책정보3[3];
		
		list[0]=new 박수경_책정보3("아이가 없는 집","알렉스 안도릴",16200);
		list[1]=new 박수경_책정보3("홀","편혜영",13500);
		list[2]=new 박수경_책정보3("7년의 밤","정유정",16650);
		
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i].toString());
			System.out.println();
		}
	}

}
