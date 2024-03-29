package oopbasic;
// static메소드와 non-static메소드의 차이점과 사용방법
// static메소드는 static멤버의 값을 조작하거나 유틸리티처럼 메소드를 편하게 사용하기 위한 목적
// 자원을 엑세스 하거나 모든 객체에서 공통으로 사용하는 기능을 static 메소드로 표현
public class StaticMethodDemo {
    static int staticNum;   // 클래스 변수
    int num;    // 인스턴스 변수
    // static 블럭 - 클래스로더에 의해서 클래스에 대한 정보가 method영역에 올라갈 때 한번 실행되는 영역
    static{
        // static멤버변수의 값을 초기화
        staticNum = 1000;
        System.out.println("static블럭 - 클래스가 로딩될 때 한 번 실행되는 코드를 정의할 목적");
        System.out.println("static블럭 - 자원에 대한 엑세스");
        System.out.println("static블럭 - static멤버를 초기화할 목적");
    }
    // 객체의 고유한 값을 제어하는 기능이 아니라 일반적인 기능들도 static을 추가할지 고려
    public static void printSize(String str){   // ------------정적메소드
        // 매개변수로 전달되는 문자열의 사이즈를 출력하는 기능
        System.out.println("사이즈=>" + str.length());
    }
    public static void print(){// ------------정적메소드
        System.out.println("============================");
        // 1. static메소드에서 static메소드를 호출하기
        // => 일반적인 접근방식
        display();
    }
    // static 멤버를 제어하는 메소드는 static을 추가
    public static void display(){// ------------정적메소드
        System.out.println(staticNum);
    }
    public void show(){// ------------인스턴스메소드
        // 2. non-static메소드에서 non-static 메소드를 호출
        // -> 일반적인 접근방식
        test();
        System.out.println(num);
    }
    public void test(){// ------------인스턴스메소드
        // 3. non-static메소드에서 static 메소드를 호출
        // -> 일반적인 접근방식
        change();
        System.out.println("테스트");
    }
    public static void change(){ // ------------정적메소드
        // 4. static 메소드에서 non-static 메소드를 호출
        // => change가 메모리에 있는 상태에 바로 examtest를 확인할 수 없으므로 에러가 발생
        // => 같은 클래스에서 선언된 메소드라고 하더라도 static메소드 안에서 non-static메소드를 호출하는 경우
        //    객체생성 후 참조변수를 통해서 호출
        StaticMethodDemo obj = new StaticMethodDemo();
        obj.examtest();
        System.out.println("change");
    }
    public void examtest(){ // ------------인스턴스메소드
        System.out.println("examtest");
    }
}
