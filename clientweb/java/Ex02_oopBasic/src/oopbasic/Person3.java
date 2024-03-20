package oopbasic;
// 자바에서는 모든 데이터타입으로 멤버변수와 메소드를 정의할 수 있다.

import java.util.Scanner;

public class Person3 {
    private String name;    // 기본형
    private int age;         // 기본형
    private boolean state;   // 기본형
    private double data;     // 기본형
    private Movie movie;      // 사용자 정의 클래스
    private Scanner key;    // 참조형 - API에 제공되는 클래스
    private int[] scores;   // 배열

    // boolean형 멤버변수에 setter/ getter
    public void setState(boolean state){
        this.state = state;
    }
    public boolean getState() {
        return state;
    }
    public void setData(double data) {
        this.data = data;
    }
    public double getDate(){
        return data;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    // Scanner와 같이 API에서 제공되는 클래스를 매개변수나 리턴타입으로 명시
    public void setKey(Scanner key){
        this.key = key;
    }
    public Scanner getKey(){
        return key;
    }
    // 배열을 리턴타입이나 매개변수 타입으로 명시
    public void setScores(int[] scores){
        this.scores = scores;
    }
    public int[] getScores(){
        return scores;
    }
    // 사용자 정의로 작성한 클래스를 리턴이나 매개변수의 타입으로 병시
    public void setMovie(Movie movie){
        this.movie = movie;
    }
    public Movie getMovie(){
        return movie;
    }
}
