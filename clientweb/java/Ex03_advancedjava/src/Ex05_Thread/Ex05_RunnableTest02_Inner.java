package Ex05_Thread;
class A implements Runnable{

    @Override
    public void run() {
        
    }
    
}
public class Ex05_RunnableTest02_Inner {
    public static void main(String[] args) {
        // Thread t = new Thread(new A());
        // Runnable implements하는 이름이 없는 클래스를 정의하고 바로 생성해서 사용할 수 있도록 작업
        // => 생성하면서 바로 정의해서 사용할 수 있다.
        // 객체를 생성하면서 생성자 내부에서 바로 클래스를 정의하고 있음
        // new Runnable(){}
        // => Runnable의 하위 클래스를 바로 정의해서 생성
        //    바로 정의해서 메모리에 올려서 다른 클래스의 매개변수로 전달할 것이므로 이름이 필요없다.
        //    익명 클래스 (익명 이너클래스)
        //    => 람다, 안드로이드나 GUI프로그램과 같이 이벤트 드리븐 방식의 코드를 구현할 때 사용
        System.out.println("메인시작");
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 1; i<=20; i++){
                    System.out.print("익명이너클래스");
                    try {
                        Thread.sleep(500);      // 0.5초 쉬게하기
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

            }

        }).start();
    }
}
