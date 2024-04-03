package Ex05_Thread;
/*
 * 자바에서 쓰레드 프로그래밍을 하는 방법
 * 1. Thread클래스를 상속받아 작성
 * 2. Runnable인터페이스의 하위클래스를 작성하고 이 클래스를 이용해서 Thread클래스를 생성해서 사용하는 방법
 *    => 다른 클래스를 이미 상속하고 있는 경우 Thread 클래스를 상속해서 쓰레드 프로그래밍을 할 수 없으므로
 *    1) Runnable 인터페이스를 상속(구현)
 *    2) run메소드를 오버라이딩해서 쓰레드 프로그래밍으로 처리하고 싶은 내용을 정의한다.
 *    3) 쓰레드를 시작하는 곳에서 Runnable객체를 생성하고 이를 이용해서 Thread객체를 생성
 *       => Runnable하위 객체 생성
 *       => Thread객체를 생성하면서 Runnable 하위 객체를 매개변수로 전달
 *    4) Thread객체의 start메소드를 호출
 */

class Super{

}

class RunnableDemo01 extends Super implements Runnable{

    @Override
    public void run() {
        for(int i = 1; i<=20; i++){
            // getName은 Thread클래스의 정의되어있는 메소드이므로 Runnable에서는 사용할 수 없다.
            // Thread.currentThread()를 이용하면 현재 실행중인 쓰레드 객체를 리턴받아서 호출
            System.out.print(i+"("+Thread.currentThread().getName()+")"+"\t");
            try {
                Thread.sleep(500);      // 0.5초 쉬게하기
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i%5==0){
                System.out.println();
            }
        }
        
    }

}

public class Ex03_RunnableTest01 {
    public static void main(String[] args) {
        System.out.println("******메인 시작******");
        // 1. Runnable하위객체를 생성
        RunnableDemo01 obj = new RunnableDemo01();
        // 2. 생성한 Runnable하위 객체를 이용해서 Thread객체를 생성
        Thread t1 = new Thread(obj,"t1"); 
        Thread t2 = new Thread(new RunnableDemo01(),"t2"); 
        t1.start();
        t2.start();
        for(int i = 1; i<=10; i++){
            System.out.println("main쓰레드");
            try {
                Thread.sleep(500);      
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("******메인 종료******");
    }
}
