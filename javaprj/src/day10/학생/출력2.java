package day10.학생;

import java.util.ArrayList;
import java.util.Scanner;

public class 출력2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Song> favoriteSongs = new ArrayList<>();

        while (true) {
            System.out.println("\n💿 메뉴 선택: 1) 좋아하는 노래 목록 추가  2) 노래 정보 출력  3) 종료");
            System.out.print("입력: ");

            if (!sc.hasNextInt()) {  // ✅ 숫자 입력 유효성 검사
                System.out.println("⚠ 숫자를 입력하세요.");
                sc.next();  // 잘못된 입력 제거
                continue;
            }

            int choice = sc.nextInt();
            sc.nextLine();  // 버퍼 비우기

            if (choice == 1) {  // 좋아하는 노래 추가
                System.out.println("\n🎵 노래 제목을 입력하세요 ( '좋아하는 노래' 입력 시 목록 출력 )");
                SongLibrary.printAllSongs();

                while (true) {
                    System.out.print("\n입력: ");
                    String input = sc.nextLine().trim();

                    if (input.equalsIgnoreCase("좋아하는 노래")) {  // ✅ 대소문자 구분 없이 비교
                        break;
                    }

                    if (input.isEmpty()) {  // ✅ 공백 입력 방지
                        System.out.println("⚠ 올바른 노래 제목을 입력하세요.");
                        continue;
                    }

                    Song selectedSong = SongLibrary.findSong(input);
                    if (selectedSong != null) {
                        if (!favoriteSongs.contains(selectedSong)) {
                            favoriteSongs.add(selectedSong);
                            System.out.println("✅ " + selectedSong.getTitle() + " 추가 완료!");
                        } else {
                            System.out.println("⚠ 이미 추가된 노래입니다.");
                        }
                    } else {
                        System.out.println("❌ 해당 노래가 목록에 없습니다.");
                    }
                }

                // ✅ 좋아하는 노래 목록 출력 (제목 + 가수)
                System.out.println("\n📜 좋아하는 노래 목록:");
                if (favoriteSongs.isEmpty()) {
                    System.out.println("💿 좋아하는 노래가 없습니다.");
                } else {
                    for (Song song : favoriteSongs) {
                        song.printMusic();  // ✅ 제목과 가수 출력
                    }
                }
            } 
            else if (choice == 2) {  // 노래 정보 출력
                System.out.print("\n🔎 찾고 싶은 노래 제목을 입력하세요: ");
                String findMusic = sc.nextLine().trim();

                if (findMusic.isEmpty()) {  // ✅ 공백 입력 방지
                    System.out.println("⚠ 올바른 노래 제목을 입력하세요.");
                    continue;
                }

                Song selectedSong = SongLibrary.findSong(findMusic);
                if (selectedSong != null) {
                    selectedSong.printMusicInfo();  // ✅ 노래 정보 전체 출력
                } else {
                    System.out.println("❌ 해당 노래는 목록에 없습니다.");
                }
            } 
            else if (choice == 3) {  // 종료
                System.out.println("프로그램 종료!");
                break;
            } 
            else {
                System.out.println("⚠ 올바른 숫자를 입력하세요.");
            }
        }
    }
}
