package day12.상속.다형성;

public class Cat  extends Animal{
	
	//부모의  bark매서드를 재정의 (override ) 
	//재정의를 하면 부모의 매서드와 별개로 별도의 자식의 매서드가 생긴다
	//재정의할 때는 반드시 부모의 매서드와 일치해야한다 
	
	@Override
	public void 짖다() {
		 System.out.println("야옹");
	}

}
