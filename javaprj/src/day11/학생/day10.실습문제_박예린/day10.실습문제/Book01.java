package day10.실습문제;

public class Book01
{
	private String title;
    private String author;
    private int price;

    public Book01()
    {
    	
    }
    
    public Book01(String title, String author, int price)
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
