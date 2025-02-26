package day09.학생;

public class donuts3 {
	String name;
	int price;
	int kcal;
	int cnt;
	
	Object[][] donuts = new Object[3][4];
	
	public void 입력() {
		donuts[0] = new Object[] {"초코 크러쉬 도넛", 3900, 345, 7};
		donuts[1] = new Object[] {"솔티 초코 프레첼넛", 4300, 430, 5};
		donuts[2] = new Object[] {"스마일 도넛", 2900, 404, 6};
	}
	
	public void 출력() {
		for(int i=0; i<donuts.length; i++) {
			System.out.println(i+1);
			System.out.println("제품명: "+ donuts[i][0]);
			System.out.println("가격: "+ donuts[i][1]);
			System.out.println("칼로리: "+ donuts[i][2] +"kcal");
			System.out.println("남은수량: "+ donuts[i][3] +"개");
		}
	}
}
