package day12.practice;

public class HouseMain {

	public static void main(String[] args) {
		
		//부모 House
		//자식 Me , Sister
		
		Me me = new Me();
		Sister sister = new Sister();
		
		
		///업캐스팅
		House h1 = me;
		h1.집안일();
		//h1.바닥쓸기(); //자식메서드라 안됨
		
		House h2 = sister;
		h2.집안일();
		//p2.바닥닦기(); 

		System.out.println("==================");
		
		
		///다운캐스팅
		Me m = (Me) h1;
		m.바닥쓸기();
		
		Sister s = (Sister) h2;
		s.바닥닦기();
		
		
		/*
	
		///잘못된 다운캐스팅 -- 업캐스팅 후에 다운캐스팅 해야 함
		House house = new House();
		Me m2 = (Me) house;
		m2.바닥쓸기();
		
		Sister s2 = (Sister) house;
		s2.바닥닦기();
	
		*/
		
		

	}

}
