package day10.실습문제;

public class 출력
{
	public static void main(String[] args)
	{
        Book01 b1 = new Book01("그 많던 싱아는 누가 다 먹었을까", "박완서", 17000);
        Book01 b2 = new Book01("그 산이 정말 거기 있었을까", "박완서", 17000);
        Book01 b3 = new Book01("나목", "박완서", 14000);

        b1.printBook();
        System.out.println("---------------------------------");

        b2.printBook();
        System.out.println("---------------------------------");

        b3.printBook();
        System.out.println("---------------------------------");
		
		System.out.println("==========================================");

		Book02[] list = new Book02[3];
		
		list[0] = new Book02("그 많던 싱아는 누가 다 먹었을까", "박완서", 17000);
		list[1]= new Book02("그 산이 정말 거기 있었을까", "박완서", 17000);
		list[2] = new Book02("나목", "박완서", 14000);
		
		for(int i=0; i < list.length; i++)
		{
			Book02 item  = list[i];
			item.printBook();
			System.out.println("---------------------------------");
		}
	}
}
