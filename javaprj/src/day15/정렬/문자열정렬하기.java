package day15.정렬;

public class 문자열정렬하기 {

	public static void main(String[] args) {
	
		
		String[] arr = new String[] {"banana","tomato","apple"};

		
		
		//정렬
		//선택정렬
		//compareTo 기준문자열.compareTo(비교문자열) => 0(같다), 음수(기준이 앞에 있다), 양수(기준이 뒤에 있다)
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i].compareTo(arr[j]) > 0){
					
					//임시변수
					String temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		
		//정렬후 ==>
		
		for(String str : arr) {
			System.out.println(str + ", ");
		}
		
		
		//
		String a="banana";
		String b="apple";
		
		
		int result = b.compareTo(a);	//음수 기준(b=apple)이 사전상 앞에 있다
		int result2 = a.compareTo(b);	//양수 왜냐면 기준(a=banana)가 뒤에 있어서.. 뭔소리야?
										// 아 알파벳??? ㅇㅋㅇㅋ
		
		System.out.println(result);
		System.out.println(result2);

	}

}
