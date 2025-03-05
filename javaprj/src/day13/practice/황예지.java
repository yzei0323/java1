package day13.practice;

public class 황예지 extends Acorn{

	String email;
	String address;
	
	
	public 황예지(String id, String name, String phone, String email, String address) {
		super(id, name, phone);
		this.email = email;
		this.address = address;
	}
	
	@Override
	public void printInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(phone);
		System.out.println(email);
		System.out.println(address);
	}
}
