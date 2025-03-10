package chap_08_interFace.Day00.Ex03;

import java.util.Scanner;

//timer클래스에 Thread 상속
public class MyTimer extends Thread {
    Scanner sc = new Scanner(System.in);
    // 타이머가 완전히 종료됐는지 확인
    // Control 클래스가 타이머 종료를 기다리는데 사용
    // "타이머가 완전히 끝났는가?"를 체크
    private boolean isFinished = false;


    public boolean isFinished() {
        return isFinished;
    }
    @Override
    // Thread는 무조건적으로 run에 실행 될 기능을 넣어야함
    public void run() {
        //System.out.println("원하는 시간을 입력해주세요");
        int min = sc.nextInt();
        String[] progress = new String[10];  // 프로그레스바 배열

        for (int i = min; i >= 0; i--) {
            // 계산식
            // ex) 입력:3   300 / 3 = 100%
            //     입력:3   30 /  3 = 10칸
            int percentage = (i * 100) / min;  // 100%에서 시작해서 0%로
            int filledBars = (i * 10) / min;  // 10칸에서 시작해서 0칸으로

            // 프로그레스바 그리기
            // progress[0] = j가 필드바보다 커?   True ----> "■"  false - - - - - > "□"
            for(int j = 0; j < progress.length; j++) {
                progress[j] = (j < filledBars) ? "■" : "□";
            }

            // ⭐️한 줄에 타이머와 프로그레스바 출력
            // 원래라면 오른쪽으로 연속적으로 출력이 되지만,
            // \r의 기능으로 커서가 처음자리로부터 게속 출력이 된다 그래서 점점 줄어들게 보임
            // print : 연속적으로 오른쪽에다가 출력
            System.out.print("\r타이머: " + i + " [");
            for(String s : progress) {
                System.out.print(s);
            }
            System.out.print("] " + percentage + "%");

            if (i == 0){
                System.out.println("\n에어컨이 꺼졌습니다");
                isFinished = true;  // 타이머 종료 표시
            }

            try {
                Thread.sleep(1000); //1초 제어
            } catch (InterruptedException e) {  // 예외상황 (그냥 넘어가기)
                e.printStackTrace();
            }
        }
    }
}