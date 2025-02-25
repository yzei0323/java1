package day07.practice;

public class 함수문제3번 {

	public static void main(String[] args) {
		
<<<<<<< HEAD
		//3. 주간날씨정보를 반환하는 함수 만들기
		
		
		String[] weathers = new String[] {"종일 맑은 하늘을 볼 수 있는 날이에요","하루종일 구름이 많은 날이에요",
				"하루종일 대체로 맑은 날씨가 이어져요","비가 올 것 같아요","바람이 많이 부는 날이에요",
				"하늘이 잔뜩 흐려있어요","하루 종일 흐린 날씨가 예상돼요"};

	}

	public static String 주간날씨정보(String[] weathers) {
		for(int i=0; i<weathers.length; i++) {
			String weather = weathers[i];
		}
		return weather;
	}
=======
		
		//3. 주간날씨정보를 반환하는 함수 만들기
		String[] weathers = new String[] {"하루종일 맑은 하늘을 볼 수 있어요","종일 구름 많은 하늘을 볼 수 있는 하루예요",
				"하루종일 대체로 맑은 날씨가 이어져요","하늘이 잔뜩 흐려있어요",
				"바람이 많이 불어요","화창한 날씨가 지속돼요","비가 올 것 같아요"};
			
		
		String[] result = 주간날씨(weathers);
		for(String weather : result) {
			System.out.println(weather);
		}
		
	}
	
	
		
	
	public static String[] 주간날씨(String[] weathers) {
		return weathers;
	}	

>>>>>>> a31b29f20480a8e5cedf33b98a12463217457d7d
}
