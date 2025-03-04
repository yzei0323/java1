package day11.학생;

public class Book01_박예린
{
	private String title;
    private String author;
    private int price;

    public Book01_박예린()
    {
    	
    }
    
    public Book01_박예린(String title, String author, int price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString()
    {		
		return title + author + price;
	}
    
    public void printBook()
    {
        System.out.println("제목: " + title);
        System.out.println("저자: " + author);
        System.out.println("가격: " + price + "원");
    }
}
