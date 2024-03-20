package oopbasic_constructor;
// Java FOJO
public class Movie {
    private String title;
    private String genre;
    
    // insert용, select용
    public Movie(String title, String genre){
        this.title = title;
        this.genre = genre;
    }
    public Movie(){
        
    }
    // setter 메소드는 update용
    // 멤버변수의 값을 변경하는 메소드의 매개변수는 멤버변수의 변수명과 동일하게 작업
    public void setTitle(String title){
        // 지역변수 title = 지역변수 title 값 ----- x
        // 멤버변수 title = 지역변수 title ----- o
        this.title = title;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }
    public void play(){
        System.out.println(title+"("+genre+")"+"상영중입니다");
    }
    
}
