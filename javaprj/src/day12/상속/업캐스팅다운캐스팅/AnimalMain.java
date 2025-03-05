package day12.상속.업캐스팅다운캐스팅;

public class AnimalMain {
	public static void main(String[] args) {
		
		
		Cat cat  = new Cat();
		cat.짖다();
		cat.쥐를잡는다();
		
		
		Dog dog  = new Dog();
		dog.짖다();
		dog.집을지킨다();
		
		
		
		//업캐스팅		
		Animal animal1;
		animal1=  cat;      // 부모형type으로 변환됨  ( 참조하는 type만 변경되는 것임. 실체 instance가 변경되는 것이 아니다)
		//animal1 = (Animal) cat;  
		//업캐스팅되면 부모형만큼 해석된다 (사용할 수 있는 매서드가 부모형으로 축소됨)
		//animal1.쥐를잡는다();  사용불가능 
		animal1.짖다(); //짖다()만 가능하다는거지??? 부모형 메서드만 가능?? 아 다운캐스팅을 해야 다시 쓸 수 있음
		
		//다운캐스팅 (업캐스팅된 이후에 올바른 다운캐스팅이 될 수 있다 )
		//다운캐스팅 ( 명시적으로 형을 변환해야 함)  업캐스팅을 해야 다운캐스팅도 가능하고
		
		Cat cc =  (Cat) animal1;  //다운캐스팅
		cc.쥐를잡는다();
		
		
		
		
	}

}
