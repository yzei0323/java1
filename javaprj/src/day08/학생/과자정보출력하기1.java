package day08.학생;

public class 과자정보출력하기1 {

	public static void main(String[] args) {
		
		Snack c = new Snack();
		c.name="맛동산";
		c.company="농심";
		c.calories="600kcal";
		c.info="탄수화물:57g, 당류:21g, 지방:20g, 포화지방:4.6g, 단백질:8g";
		
		c.gram= 600;
		c.expDate= 2025_02_25;
		c.bornyear=1975_08_17;
		
		
		printSnack(c);
	}
	
	public static void printSnack(Snack c) {
		System.out.println(c.name);
		System.out.println(c.company);
		System.out.println(c.calories);
		System.out.println(c.info);
		System.out.println(c.gram);
		System.out.println(c.expDate);
		System.out.println(c.bornyear);
	}
}
