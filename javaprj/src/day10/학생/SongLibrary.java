package day10.학생;

import java.util.ArrayList;

class SongLibrary {
    private static ArrayList<Song> songs = new ArrayList<>();  // ✅ private으로 변경

    // 노래 데이터 추가
    static {
        songs.add(new Song("TOO BAD", "G-DRAGON", "랩/힙합", 154, "2025.02.25"));
        songs.add(new Song("Pink + White", "FRANK OCEAN", "R&B", 184, "2016-08-20"));
        songs.add(new Song("REBEL HEART", "IVE", "댄스", 186, "2025.02.10"));
        songs.add(new Song("나는 반딧불", "황가람", "발라드", 216, "2025.02.08"));
    }

    public static Song findSong(String title) {
        if (title == null || title.trim().isEmpty()) {
            return null;  // ✅ 유효성 검사: 제목이 공백 또는 null이면 검색하지 않음
        }

        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {  // ✅ 대소문자 구분 없이 검색
                return song;
            }
        }
        return null;
    }

    public static void printAllSongs() {
        System.out.println("\n🎵 전체 노래 목록:");
        for (Song song : songs) {
            System.out.println("🎶 " + song.getTitle());
        }
    }
}


