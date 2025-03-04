package day11.학생;

public class 책정보3_main_박수경 {
	//3. 책정보(title,author, price)를 담을 수 있는 Book 클래스를 정의하고 책정보 3개를 객체 배열로 만들고 출력
	public static void main(String[] args) {

		책정보3_박수경[] list = new 책정보3_박수경[3];
		
		list[0]=new 책정보3_박수경("아이가 없는 집","알렉스 안도릴",16200);
		list[1]=new 책정보3_박수경("홀","편혜영",13500);
		list[2]=new 책정보3_박수경("7년의 밤","정유정",16650);
		
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i].toString());
			System.out.println();
		}
	}

}
