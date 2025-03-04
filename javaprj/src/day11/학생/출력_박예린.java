package day11.학생;

public class 출력_박예린
{
	public static void main(String[] args)
	{
        Book01_박예린 b1 = new Book01_박예린("그 많던 싱아는 누가 다 먹었을까", "박완서", 17000);
        Book01_박예린 b2 = new Book01_박예린("그 산이 정말 거기 있었을까", "박완서", 17000);
        Book01_박예린 b3 = new Book01_박예린("나목", "박완서", 14000);

        b1.printBook();
        System.out.println("---------------------------------");

        b2.printBook();
        System.out.println("---------------------------------");

        b3.printBook();
        System.out.println("---------------------------------");
		
		System.out.println("==========================================");

		Book02_박예린[] list = new Book02_박예린[3];
		
		list[0] = new Book02_박예린("그 많던 싱아는 누가 다 먹었을까", "박완서", 17000);
		list[1]= new Book02_박예린("그 산이 정말 거기 있었을까", "박완서", 17000);
		list[2] = new Book02_박예린("나목", "박완서", 14000);
		
		for(int i=0; i < list.length; i++)
		{
			Book02_박예린 item  = list[i];
			item.printBook();
			System.out.println("---------------------------------");
		}
	}
}
