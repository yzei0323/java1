package day11.학생;

public class 실행_최하은 {

	public static void main(String[] args) {
		// toString
		System.out.println("toString");
		
		책_최하은 one = new 책_최하은("과학의 눈으로 세상을 봅니다", "이정모", 17000);
		책_최하은 two = new 책_최하은("아몬드", "손원평", 14000);
		
		System.out.println( one.toString() + "\n");
		System.out.println( two.toString() );
		
		System.out.println("--------------------------");
		
		//객체
		System.out.println("객체");
		
		책_최하은 b1 = new 책_최하은("과학의 눈으로 세상을 봅니다", "이정모", 17000);
		책_최하은 b2 = new 책_최하은("아몬드", "손원평", 14000);
		
		System.out.println(b1+"\n");
        System.out.println(b2);
        
        System.out.println("--------------------------");
        
        //객체배열
        System.out.println("객체배열");
        
        책_최하은[] list = new 책_최하은[2];
        list[0] = new 책_최하은("과학의 눈으로 세상을 봅니다", "이정모", 17000);
        list[1] = new 책_최하은("아몬드", "손원평", 14000);
        
        for(책_최하은 item : list) {
        	item.print();
        }
        
	}

}
