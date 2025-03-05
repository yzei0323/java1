package day12.학생;

public class Instanceof_이동우 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hotelier_이동우 f = new Hotelier_이동우( "고객응대", " 호텔과 고객을 이어주는 역할을 함 ", "프론트데스크");
//		f.forntPrintInfo();
		
		Hotelier_이동우 b = new Hotelier_이동우( "식음료 업장 관리", "레스토랑을 이용하는 고객에게 음식과 서비스를 제공하는 역할을 함", "F&B 부서");
		
//		b.forntPrintInfo();
		

		Hotel_이동우 [] list = new Hotel_이동우[2];
		
		list[0] = f;
		list[1] = b;
		
		
		for(int i = 0; i < list.length; i++) {
//			list[i].printInfo();
//			list[i].forntPrintInfo(); //오류
			
			//다운캐스팅
			if(list[i] instanceof Hotelier_이동우) {
				Hotelier_이동우 temp = (Hotelier_이동우) list[i];
//				temp.printInfo();
				temp.forntPrintInfo();
			}
		}
		
	}

}
