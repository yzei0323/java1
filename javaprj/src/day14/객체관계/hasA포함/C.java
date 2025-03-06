package day14.객체관계.hasA포함;

//
//약한결합 (느슨한 결합)
public class C {

	
	D d;
	
	//약한 결합
	//외부에서 생성된 D객체를 주입받는 방법
	
	//주입받는 방법
	//1. 생성자
	//2. 세터
	
	
	public C() {
		
	}
	
	/*
	//1.생성자주입 - 내부생성
	public C(D d) { //타입이 D임 헐~~~ 왤케 인식이 안되지
		this.d = d; 
	}
	*/
	
	//2.세터주입 - 외부생성
	public void setD(D d) {
		this.d = d;
	}
	
	
	
	public void C매서드() {
		System.out.println("C매서드");
		d.D매서드();
	}

	
	
	
}
