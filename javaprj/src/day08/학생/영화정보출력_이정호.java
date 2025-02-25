package day08.학생;

public class 영화정보출력_이정호 {

	public static void main(String[] args) {
		Movie movie = new Movie();
		
		movie.title = "미키 17";
		movie.director = "봉준호";
		movie.genre = "모험";
		movie.runningTime = 137;
		movie.releaseYear = 2025;
		movie.releaseMonth = 2;
		movie.releaseDate = 28;

		Mikey_17(movie);
	}

	public static void Mikey_17(Movie movie) {
		System.out.println("제목 : " + movie.title);
		System.out.println("감독 : " + movie.director);
		System.out.println("장르 : " + movie.genre);
		System.out.println("상영시간 : " + movie.runningTime + "분");
		System.out.println("개봉일 : " + movie.releaseYear + "년 " + movie.releaseMonth + "월 " + movie.releaseDate + "일");
	}
}
