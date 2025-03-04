package day12.상속.업캐스팅다운캐스팅;

public class AnimalMain {

	public static void main(String[] args) {
		
		
		Cat cat = new Cat();
		cat.짖다();
		cat.쥐를잡는다();
		
	
		Dog dog = new Dog();
		dog.짖다();
		dog.집을지킨다();

		
		//업캐스팅
		Animal animal1;
		animal1 = cat;		//부모형type으로 변환됨 (참조하는 type만 변경되는 것임. 실제 instance가 변경되는 것이 아니다)
		//animal1 = (Animal) cat;
		//업캐스팅되면 부모형만큼 해석된다 (사용할 수 있는 메서드가 부모형으로 축소됨)
	}

}
