package day16.practice;

public class Age {

	public int age(int su) throws 나이예외_runtimeException {
		//나이가 0보다 작고 150보다 크면 나이예외 발생
		
		if(su<0 || su>150) {
			throw new 나이예외_runtimeException("올바른 나이가 아닙니다");
		}
		return su;
	}
	
	public int age2(int su) throws 나이예외{
		if(su<0 || su>150) {
			throw new 나이예외_runtimeException("올바른 나이가 아닙니다");
		}
		return su;
	}
}
