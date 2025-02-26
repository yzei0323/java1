package day09.practice;

public class 실습문제1 {

	//1. 쇼필몰 정보, 제임스씨 고객정보를 ClassType으로 지정하고
	// input(), getInfo() 이용하여 값을 저장하고 값을 출력하기
	
	long orderNum;
	String orderId;
	String orderDate;
	String orderName;
	String orderItem;
	String address;
	
	int age;
	String name;
	boolean isMarried;
	int childCnt;
	
	
	
	public void input() {
		this.orderNum = 201803120001l;
		this.orderId = "abc123";
		this.orderDate = "2018년3월12일";
		this.orderName = "홍길순";
		this.orderItem = "D0345-12";
		this.address = "서울시 영등포구 여의도동 20번지";
		
		this.age = 40;
		this.name = "James";
		this.isMarried = true;
		this.childCnt = 3;
	}
	
	public void getInfo() {
		System.out.println("주문번호: "+this.orderNum);
		System.out.println("주문자아이디: "+this.orderId);
		System.out.println("주문날짜: "+this.orderDate);
		System.out.println("주문자이름: "+this.orderName);
		System.out.println("주문상품번호: "+this.orderItem);
		System.out.println("배송주소: "+this.address);
		System.out.println("나이: "+this.age);
		System.out.println("이름: "+this.name);
		System.out.println("결혼여부: "+this.isMarried);
		System.out.println("자녀 수: "+this.childCnt);
	}
}
