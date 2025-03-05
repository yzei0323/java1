package day11.학생;

public class 최하은_실행 {

	public static void main(String[] args) {
		// toString
		System.out.println("toString");
		
		최하은_책 one = new 최하은_책("과학의 눈으로 세상을 봅니다", "이정모", 17000);
		최하은_책 two = new 최하은_책("아몬드", "손원평", 14000);
		
		System.out.println( one.toString() + "\n");
		System.out.println( two.toString() );
		
		System.out.println("--------------------------");
		
		//객체
		System.out.println("객체");
		
		최하은_책 b1 = new 최하은_책("과학의 눈으로 세상을 봅니다", "이정모", 17000);
		최하은_책 b2 = new 최하은_책("아몬드", "손원평", 14000);
		
		System.out.println(b1+"\n");
        System.out.println(b2);
        
        System.out.println("--------------------------");
        
        //객체배열
        System.out.println("객체배열");
        
        최하은_책[] list = new 최하은_책[2];
        list[0] = new 최하은_책("과학의 눈으로 세상을 봅니다", "이정모", 17000);
        list[1] = new 최하은_책("아몬드", "손원평", 14000);
        
        for(최하은_책 item : list) {
        	item.print();
        }
        
	}

}
