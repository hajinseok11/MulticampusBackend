package oopbasic;
// 인스턴스 변수와 클래스 변수 비교
// 인스턴스 변수 -> 객체가 소유하는 변수(객체 변수: 객체마다 고유한 값을 갖는 경우)
// 클래스 변수 (정적 변수) -> 모든 객체가 공유해서 사용하는 변수
//                          상수는 변하지 않는 값으로 모든 객체가 공유해서 사용해야 하므로
//                          상수를 정의할 때 final과 static을 같이 사용
// static이 추가된 변수를 클래스 변수라 한다.
public class StaticDemo {
    int num;    // 인스턴스 변수
    static int staticNum; // 모든 객체가 공통으로 사용하는 값이나 누적된 값을 저장하기 위해서 사용
    public StaticDemo(){
        num++;
        staticNum++;
    }
    public void display(){
        System.out.println("num=> " + num+",staticNum = "+staticNum);
    }
}
