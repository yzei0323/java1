package day09.practice;

public class 실습1 {

	//1. 사람의 정보를 담을 클래스 만들기
	/*
	나이가 40살, 이름이 James라는 남자가 있습니다.
	이 남자는 결혼을 했고 자식이 셋 있습니다.
	출력결과
	이 사람의 나이
	이 사람의 이름
	이 사람의 결혼 여부
	이 사람의 자녀 수
	
	(각 멤버변수에 맞는 자료형을 생각해 보세요: 결혼여부 isMarried => boolean)
	*/
	
	int age;
	String name;
	boolean isMarried;
	int childCnt;
	
	
	public void 입력(int age, String name, boolean isMarried, int childCnt) {
		this.age = age;
		this.name = name;
		this.isMarried = isMarried ;
		this.childCnt = childCnt;
	}
	
	public void 출력() {
		System.out.println("나이: "+this.age);
		System.out.println("이름: "+this.name);
		System.out.println("결혼여부: "+this.isMarried);
		System.out.println("자녀 수: "+this.childCnt);
	}
}
