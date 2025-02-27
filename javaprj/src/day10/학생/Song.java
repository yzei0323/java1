package day10.학생;

import java.util.ArrayList;

class Song {

	String title;
	String artist;
	String genre;
	int runningtime;
	String releaseDate;
	
	public Song( String title, String artist, String genre, int runningtime, String releaseDate ) {
		this.title = title;
		this.artist = artist;
		this.genre = genre;
		this.runningtime = runningtime;
		this.releaseDate = releaseDate;
	}
	
	public String getTitle() {
		return title;
	}
	public String toString() {
        return title;  // 좋아하는 노래 목록 출력 시 제목만 반환
    }

	public void printMusic() {
        System.out.println( "🎵 " + title + " - " + artist );
    }
	 public void printMusicInfo() {
	    	System.out.println("================");
	    	System.out.println("제목: " + title);
	        System.out.println("가수: " + artist);
	        System.out.println("장르: " + genre);
	        System.out.println("재생 시간: " + runningtime);
	        System.out.println("발매일: " + releaseDate);
	        System.out.println("================");
	    }
	
}
	
	
	