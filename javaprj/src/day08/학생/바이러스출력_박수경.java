package day08.학생;

public class 바이러스출력_박수경 {

	public static void main(String[] args) {
		// 감기의 종류

		virus_박수경 info=new virus_박수경();
		info.soreThroat="목감기";
		info.coughing="기침감기";
		info.runnyNose="콧물감기";
		info.fee=30000;
		
		print(info);
		
	}
	public static void print(virus_박수경 info) {
		System.out.println(info.runnyNose+"에 걸리셨군요");
		System.out.println(info.soreThroat+"에 걸리셨군요");
		System.out.println(info.coughing+"에 걸리셨군요");	
		System.out.println("독감 검사 비용은 약 "+info.fee+"원 입니다.");	
		
	}
}
