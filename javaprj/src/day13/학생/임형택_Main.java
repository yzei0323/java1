package day13.학생;
	
public class 임형택_Main {
	
	public static void main(String[] args) {
		임형택_Instrument instrument = new 임형택_Instrument();
		임형택_Drum drum = new 임형택_Drum();
		임형택_Guitar guitar = new 임형택_Guitar();
		임형택_Piano piano = new 임형택_Piano();
		
		임형택_Instrument[] 악기들 = {drum, guitar, piano};
		
		System.out.println("연주 시작 ~");
		
		instrument.소리내기();
		
		for(int i = 0; i<악기들.length; i++) {
			연주(악기들[i]);
		}
		
		System.out.println("연주 끝 !");
		
	}
	
	public static void 연주(임형택_Instrument instrument) {
		instrument.소리내기();
	}

}
