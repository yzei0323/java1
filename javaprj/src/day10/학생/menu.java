package day10.학생;

import java.util.Arrays;
import java.util.Scanner;

public class menu {
	String name;
	String info;
	int price;
	int userPrice;
	String category;
	
	//int total;
	
	//객체를 문자열로 표현할때 필요한 정보를 알맞게 주도록 정의해서 반환함
	public String toString() {
		return "선택하신 메뉴는 " + name + " 입니다  ,"  + info + ", 가격은  " + price + " 입니다  " +  
				 category + "카테고리를 선택하셨습니다";
	}
	
	public menu(String name, String info, int price,  String category) {
		super();
		this.name = name;
		this.info = info;
		this.price = price;
		this.category = category;
	}
	
	
	//겟터 현재는 미사용
//	public String getName() {
//		return name;
//	}
//	 
//	public String getInfo() {
//		return info;
//	}
// 
//	public int getPrice() {
//		return price;
//	}
//	public int total() {
//		total = total + getPrice();
//		return total;
//	}
	
	
//	 
//	public int getUserPrice() {
//		return userPrice;
//	}
//	 
//	public String getCategory() {
//		return category;
//	}
//	 
	
	
	 
	
	
}
