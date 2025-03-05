package day13.학생;

public class 이동우_PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		이동우_Person per = new 이동우_Person("직장인");
		per.personInfo();
		
		이동우_Person doctor = new 이동우_Doctor("의사");
		doctor.personInfo();
		
		//다운캐스팅
		((이동우_Doctor)doctor).personInfo();
		
		이동우_Propessor ps = new 이동우_Propessor("교수");
		ps.personInfo();
		
		이동우_Student st = new 이동우_Student("학생");
		st.personInfo();
	
		
		
		
	
	}
	
	
	

}
