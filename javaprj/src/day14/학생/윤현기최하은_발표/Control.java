package chap_08_interFace.Day00.Ex03;

import java.util.Scanner;

public class Control {
	private boolean isTimerRunning =  false;// 타이머가 지금 동작 중인가?를 체크

	//⭐️비밀번호 보안에 관한 변수  비밀번호,최대 시도 횟수 , 잠금 시간은 final 변하지 않는 상수로 설정
	private int passwordAttempts = 0; // 비밀번호 시도 횟수
	private boolean isLocked = false; // 잠금 상태 false로 지정
	private static final int MAX_ATTEMPTS = 3; // 최대 시도 횟수
	private static final int LOCK_TIME = 5; // 잠금시간

	private static final String CORRECT_PASSWORD = "2369";  // 올바른 비밀번호

	// 비밀번호를 *로 입력받는 메소드
	private String getPasswordInput(Scanner sc) {
		StringBuilder password = new StringBuilder(); // 빈 StringBuilder 생성 // ⭐️String은 불변성을 가지는데 StringBuilder를 쓰면 문자열 가변 가능 ⭐️
		System.out.println("비밀번호를 입력하세요. (입력 후 Enter)");
		
		// 한 글자씩 입력받아 *로 표시
		while (true) {
			String input = sc.nextLine(); //사용자의 입력 받고
			if (input.isEmpty()) {  // 입력된 문자열이 비어있는지 확인하고
				if (password.length() > 0) {
					break;  // 비밀번호가 있으면 입력 종료
				}
				continue;  // 비밀번호가 없으면 다시 입력
			}
			password.append(input); //append: 문자열 끝에 새로운 문자열 출력
			
			// 입력된 글자 수만큼 * 출력
			StringBuilder stars = new StringBuilder();
			for (int i = 0; i < password.length(); i++) {
				stars.append("*");
			}
			System.out.print("\r" + stars.toString());  // 현재 줄의 처음으로 돌아가서 * 출력
		}
		return password.toString();
	}

	public void control() {
		Scanner sc = new Scanner(System.in);
	
		HomeControl light = new Light();
		HomeControl tv = new TV();
		HomeControl aircon = new Aircon();
		
		while (true) {
			if (isLocked) {
				handleLockdown();
				continue;
			}

			String password = getPasswordInput(sc);
			System.out.println();  // 새 줄로 이동
			
			if(password.equals(CORRECT_PASSWORD)) {
				System.out.println("문이 열렸습니다.\n어서오세요.");
				passwordAttempts = 0; // 성공 시 시도 횟수 초기화
				break;
			} else { //실패 시
				passwordAttempts++; //시도 횟수 증가
				int remainingAttempts = MAX_ATTEMPTS - passwordAttempts; //Ex) 최대횟수(3) - 시1도횟수() = 2회 남음
				
				if (passwordAttempts >= MAX_ATTEMPTS) {  //시도횟수가 최대횟수보다 크거나 같아질때
					System.out.println("⚠️ 비밀번호 " + MAX_ATTEMPTS + "회 오류! 보안을 위해 " + LOCK_TIME + "초 동안 입력이 제한됩니다.");
					isLocked = true; //잠금 활성화
					handleLockdown(); // 잠금 기능 활성화
				} else {
					System.out.println("비밀번호가 틀렸습니다. 남은 시도 횟수: " + remainingAttempts + "회");
				}
			}
		}
		
		System.out.println("");
		
		while(true) {
			// 유효성 검사 :타이머가 실행중이 아닐 때만 메뉴 출력
			if(!isTimerRunning) {
				System.out.println("저희의 홈제어는 다음 항목들이 가능합니다.");
				System.out.println("1.거실 조명 2.TV 3.에어컨 4.외출");
				System.out.println("번호를 입력하여 제어 항목을 고르세요");
			}
			// 유효성 검사 : 타이머 실행중이 아닐 때만 입력 받기
			if (!isTimerRunning){
				int option = sc.nextInt();
				sc.nextLine();

				switch(option) {
					case 1:
						System.out.println("거실 조명을 켜고 끌 수 있습니다.");
						System.out.println("명령어를 입력해주세요.");
						String order = sc.nextLine();
						if(order.equals("켜줘")) {
							light.turnOn(); // 로딩중 효과 , 바람 나오는 효과
						}else if(order.equals("꺼줘")) {
							light.turnOff();
						}else {
							System.out.println("실현 가능한 명령어가 아닙니다.");
						}
						System.out.println("");
						break;

					case 2:
						System.out.println("티비를 켜고 끌 수 있습니다.");
						System.out.println("명령어를 입력해주세요.");
						String order2 = sc.nextLine();
						if(order2.equals("켜줘")) {
							tv.turnOn();
						}else if(order2.equals("꺼줘")) {
							tv.turnOff();
						}else {
							System.out.println("실현 가능한 명령어가 아닙니다.");
						}
						System.out.println("");
						break;

					case 3:
						System.out.println("에어컨을 제어할 수 있습니다.");
						System.out.println("명령어를 입력해주세요. (켜줘/꺼줘/타이머)");
						String order3 = sc.nextLine();
						
						switch(order3) {
							case "켜줘":
								aircon.turnOn();
								break;
							case "꺼줘":
								aircon.turnOff();
								break;
							case "타이머":
								if (((Aircon) aircon).isPowerOn()) { //타이머 실행 전에 에어컨 상태 확인
									System.out.println("타이머를 설정해주세요");
									isTimerRunning = true;
									MyTimer myTimer = new MyTimer();
									myTimer.start();
									
									while (!myTimer.isFinished()){
										try {
											Thread.sleep(1000);
										} catch (InterruptedException e) {
											e.printStackTrace();
										}
									}
									isTimerRunning = false;
									System.out.println("\n메인 메뉴로 돌아갑니다");
								} else {
									System.out.println("에어컨이 꺼져 있어 타이머를 설정할 수 없습니다.");
								}
								break;
							default:
								System.out.println("잘못된 명령어입니다. 켜줘/꺼줘/타이머 중에서 입력해주세요.");
						}
						System.out.println("");
						break;

					case 4:
						System.out.println("모든 전원을 차단하겠습니다. \n안녕히 다녀오세요.");
						sc.close(); // 꼭 해주기! 스케너 종료
						return; // 꼭 해주기! 프로그램 자체 종료

				}
			}

		}

	}


	//비밀번호 3회 틀릴 시 잠금 됐을 때 기능을 하는 메서드
	private void handleLockdown() {
		try {
			System.out.print("\r대기 시간: ");
			for (int i = LOCK_TIME; i > 0; i--) { // LOCK_TIME:5 - - - - - - - - - 5 4 3 2 1
				System.out.print("\r🚨🚨🚨🚨🚨🚨🚨🚨🚨"+i + "초🚨🚨🚨🚨🚨🚨🚨🚨🚨");
				Thread.sleep(1000);
			}
			System.out.println("\n다시 시도하실 수 있습니다.");
			isLocked = false;
			passwordAttempts = 0;  // 잠금 해제 후 시도 횟수 초기화
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
