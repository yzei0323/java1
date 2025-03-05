package day13.학생;

public class 정연수_Main {

	public static void main(String[] args) {
		정연수_Parent p = new 정연수_Parent();
		정연수_FirstKid first = new 정연수_FirstKid("갑","갑이다", 10);
		정연수_SecondKids sec = new 정연수_SecondKids("을", "을이다", 12);
		정연수_ThirdKids third = new 정연수_ThirdKids("병", "병이다",6);
		
		
		
		정연수_Parent a1 = first;
		정연수_Parent a2 = sec;
		정연수_Parent a3 = third;
		
		a1.action();
		a2.action();
		a3.action();
		
		정연수_Parent[] list = new 정연수_Parent[3];
		
		list[0] = a1;
		list[1] = a2;
		list[2] = a3;
		
		for(int i=0; i<list.length; i++) {
			System.out.println(list[i].toString());
		}
		
		//a1.firstAc();
		
		
		
		
		
		if(a1 instanceof 정연수_FirstKid) {
			정연수_FirstKid aa1 = (정연수_FirstKid)list[0];
			aa1.firstAc();		
		}

	}

}
