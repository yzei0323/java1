package day09.practice;

public class 실습2 {

	//2. 쇼핑몰에 주문이 들어왔습니다. 주문 내용은 다음과 같습니다
	
	/*
		주문번호: 201803120001
		주문자아이디: abc123
		주문날짜:2018년3월12일
		주문자이름: 홍길순
		주문상품번호: D0345-12
		배송주소: 서울시 영등포구 여의도동 20번지
	*/
	
	
	long orderNum;
	String orderId;
	String orderDate;
	String orderName;
	String orderItem;
	String address;
	
	
	public void 입력() {
		this.orderNum = 201803120001l;  //뒤에 l붙여야 long으로 처리됨
		this.orderId = "abc123";
		this.orderDate = "2018년3월12일";
		this.orderName = "홍길순";
		this.orderItem = "D0345-12";
		this.address = "서울시 영등포구 여의도동 20번지";
	}

	
	public void 출력() {
		System.out.println("주문번호: "+this.orderNum);
		System.out.println("주문자아이디: "+this.orderId);
		System.out.println("주문날짜: "+this.orderDate);
		System.out.println("주문자이름: "+this.orderName);
		System.out.println("주문상품번호: "+this.orderItem);
		System.out.println("배송주소: "+this.address);
		
	}

}

