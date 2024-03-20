package oopbasic;
// 메소드의 매개변수나 리턴타입으로 참조형 타입을 사용하는 것은 주소가 복사되기 때문에 객체(배열)를 공유
// 기본형은 값이 복사되고 참조형은 주소가 복사되므로 차이점을 이해해야 한다.
// 하나의 파일에는 하나의 public클래스만 정의 할 수 있다.
class Point{
    int x = 10;
    int y = 20;
}
public class Ex10_CallByValueRefTest {
    public static void main(String[] args) {
        int i = 10; // 기본형
        int [] arr = {10,20,30,40}; // 참조형 - 배열
        Point obj = new Point(); // 참조형 - 객체
        System.out.println("*********데이터 변경 전**********");
        display(i,arr,obj);
        change(i,arr,obj);

        System.out.println("*********데이터 변경 후**********");
        display(i,arr,obj);
    }
    public static void display(int i, int [] arr, Point obj){
        // 매개변수의 값을 출력 - i, arr, obj는 display메소드에서 선언된 지역변수로 main에서 선언된 변수와 다른 변수이다.
        System.out.println("기본형 변수 i="+i);
        System.out.println("배열의 0번 요소="+arr[0]);
        System.out.println("Point객체의 x=" + obj.x + ", y=" + obj.y);
    }
    public static void change(int i, int [] arr, Point obj){
        // 매개변수로 전달받은 값을 변경
        i = 2000;
        arr[0] = 1000;
        // Point 객체의 x와 y값을 바꾸기
        int temp = obj.x;
        obj.x = obj.y;
        obj.y = temp;
    }
    
}
