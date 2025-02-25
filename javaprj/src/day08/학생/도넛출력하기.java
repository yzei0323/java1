package day08.학생;

public class 도넛출력하기 {

public static void main(String[] args) {
		
		Donuts d = new Donuts();	
		d.name="누텔라 카스텔라 도넛";
		d.price=3900;
		d.kcal=370;
		d.cnt=6;
		
		printInfo(d);
	}

	public static void printInfo(Donuts d) {
		System.out.println("이름: "+ d.name);
		System.out.println("가격: "+ d.price +"원");
		System.out.println("칼로리: "+ d.kcal +"kcal");
		System.out.println("재고: "+ d.cnt +"개");
	}

}
