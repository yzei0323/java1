package day12.학생;

public class Hotelier_이동우 extends Hotel_이동우{

	//직종
	String occupation;
	
	public Hotelier_이동우( String role, String work, String occupation) {
		super (role, work );
		
		this.occupation = occupation;
	}
	
	 public void forntPrintInfo() {
		 	
	    	System.out.println();
	    	System.out.println("직종 : " + occupation);
	    	
	    	//부모의 정보 출력
	    	printInfo();
	    	
	    	
	    }
}
