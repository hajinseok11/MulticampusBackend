package oopbasic_constructor;

public class Ex02_TestMovie { 
	public static void main(String[] args) { 
		Movie myMovie = new Movie("파묘","미스테리");
		myMovie.play();
		System.out.println("--------------------");
		
		Movie yourMovie = new Movie("쥬라기월드","액션어드벤쳐");
		yourMovie.play();
	}
}