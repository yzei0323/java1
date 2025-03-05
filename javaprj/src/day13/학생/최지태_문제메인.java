package day13.학생;

import java.util.Scanner;

public class 최지태_문제메인 {

	public static void main(String[] args) {
		최지태_문제[] ㅁ = { 
				new OX문제("boolean a = (1.1 + 0.1) == 1.2;\na의 값은 true이다.", 1),
				new 객관식문제("다음 키워드의 설명으로 올바른것은?\nprotected", 2,
						new String[] { "접근 제어자로, 모든 클래스에서 접근이 가능하다.", "접근 제어자로, 같은 클래스 내에서만 접근 가능하다.",
								"접근제어자로, 같은 패키지와 상속받은 클래스에서 접근 가능하다.", "부모 클래스의 메서드나 생성자를 호출할 때 사용한다." }),
				new 주관식문제(
						"public static void main(String args[]) {\r\n"
						+ "	int i = 3; in k = 1;\r\n"
						+ "	switch(i) {\r\n"
						+ "		case 1: k += 1;\r\n"
						+ "		case 2: k++\r\n"
						+ "		case 3: k = 0;\r\n"
						+ "		case 4: k += 3;\r\n"
						+ "		case 5: k -= 10;\r\n"
						+ "		default: k--;\r\n"
						+ "	}\r\n"
						+ "	System.out.print(k);\r\n"
						+ "}\r\n"
						+ "다음 코드를 실행하면 출력되는 결과값을 입력하세요.",
						"-8"),
				new 객관식문제("다음은 static에 대한 설명이다. 틀린것은?", 2, new String[] { "맴버 변수와 메서드에 static을 지정할 수 있다.",
						"static형 변수는 클래스 로딩시에 메모리가 할당되어 프로그램 종료까지 그 영역이 고정된다.",
						"static 메서드 안에 선언되는 변수들은 모두 static 변수가 된다.", "static 메서드 안에서는 this 나 super를 사용할 수 없다." }),
				new OX문제("String a = \"AA\";\r\n"
						+ "String b = new String(\"AA\");\r\n"
						+ "boolean c = (a == b);\n"
						+ "c의 값은 false이다.", 0) 
				};

		문제풀기(ㅁ);
	}

	public static void 문제풀기(최지태_문제[] ㅁ) {
		Scanner sc = new Scanner(System.in);
		int 문제번호 = 1;
		for (최지태_문제 문 : ㅁ) {
			System.out.println(문제번호 + "번 문제");
			문.문제출력();
			if (문 instanceof 객관식문제 || 문 instanceof OX문제) {
				문.선택지출력();
				System.out.print("정답을 입력하세요 : ");
				int 답 = sc.nextInt();
				if (문.정답인가(답 - 1)) {
					System.out.println("정답입니다!");
				} else {
					System.out.println("오답입니다!");
				}
			} else if (문 instanceof 주관식문제) {
				문.선택지출력();
				System.out.print("정답을 입력하세요 : ");
				String 답 = sc.next();
				if (문.정답인가(답)) {
					System.out.println("정답입니다!");
				} else {
					System.out.println("오답입니다!");
				}
			}
			System.out.println("");
			문제번호++;
		}
	}

}
