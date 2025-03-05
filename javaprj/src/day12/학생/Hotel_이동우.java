package day12.학생;

public class Hotel_이동우 {

	private String role; //역할
	private String work; // 업무
	
	
	public Hotel_이동우(String role, String work) {
		this.role = role;
		this.work = work;
	}
	
	//정보 출력
	public void printInfo() {
		System.out.println("하는 일 : " + work);
		System.out.println("역할 : " + role);

	}
}
