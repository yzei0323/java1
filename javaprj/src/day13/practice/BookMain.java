package day13.practice;

import java.util.ArrayList;

public class BookMain {

	public static void main(String[] args) {
		
		
		//제네릭버전
		ArrayList<Book> list = new ArrayList<>();
		
		
		
		//등록
		list.add(new Book("소년이 온다","정대건",11000,6.8));
		list.add(new Book("급류","정대건",12600,9.39));
		list.add(new Book("모순","양귀자",11700,9.81));
		list.add(new Book("채식주의자","한강",13500,9.56));
		list.add(new Book("작별하지 않는다","한강",15120,9.7));

		
		//조회
		for(int i=0; i<list.size(); i++) {
			Book objBook = list.get(i);
			objBook.printInfo();
		}
		
		
		//변경
		String title = "소년이 온다";
		Book search = null;
		for(int i=0; i<list.size(); i++) {
			
			Book b = list.get(i);
			if(b.getTitle().equals(title)){
				search = b;
				break;
			}
		}
		
		if(search != null) {
			//변경할 저자, 가격, 평점
			String newAuthor="한강";
			int newPrice=13500;
			double newRating=9.8;
			
			search.setAuthor(newAuthor);
			search.setPrice(newPrice);
			search.setRating(newRating);
			
			System.out.println("변경완료");
		}
		
		
		//삭제
		String deleteTitle="모순";
		Book deleteBook = null;
	
	}

}
