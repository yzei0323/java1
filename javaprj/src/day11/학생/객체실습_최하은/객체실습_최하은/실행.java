package day10.실습;

public class 실행 {

	public static void main(String[] args) {
		// toString
		System.out.println("toString");
		
		책 one = new 책("과학의 눈으로 세상을 봅니다", "이정모", 17000);
		책 two = new 책("아몬드", "손원평", 14000);
		
		System.out.println( one.toString() + "\n");
		System.out.println( two.toString() );
		
		System.out.println("--------------------------");
		
		//객체
		System.out.println("객체");
		
		책 b1 = new 책("과학의 눈으로 세상을 봅니다", "이정모", 17000);
		책 b2 = new 책("아몬드", "손원평", 14000);
		
		System.out.println(b1+"\n");
        System.out.println(b2);
        
        System.out.println("--------------------------");
        
        //객체배열
        System.out.println("객체배열");
        
        책[] list = new 책[2];
        list[0] = new 책("과학의 눈으로 세상을 봅니다", "이정모", 17000);
        list[1] = new 책("아몬드", "손원평", 14000);
        
        for(책 item : list) {
        	item.print();
        }
        
	}

}
