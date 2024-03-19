package oopbasic;

public class Ex05_TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie();
		myMovie.setTitle("파묘");
		myMovie.setGenre("미스테리");
		myMovie.play();
		System.out.println("--------------------");

		Movie yourMovie = new Movie();
		yourMovie.setTitle("쥬라기월드");
		yourMovie.setGenre("액션어드벤쳐");
		yourMovie.play();
	}
}