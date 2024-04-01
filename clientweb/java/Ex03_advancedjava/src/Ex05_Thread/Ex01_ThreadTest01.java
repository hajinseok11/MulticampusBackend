package Ex05_Thread;
/*
 * 자바에서 쓰레드 프로그래밍 하는 방법
 * 1. Thread클래스를 상속받아 사용하는 방법
 *  1) Thread클래스를 상속받는다.
 *  2) Thread클래스가 정의되어 있는 run메소드를 오버라이딩해서 동시에 실행하고 싶은 기능을 정의
 *                                                         -----------------------
 *                                                    쓰레드 프로그램으로 처리하고 싶은 내용    
 *      => run메소드를 직접호출하지 않는다.
 *  3) Thread클래스에 정의되어 있는 start 메소드를 호출한다.
 *      => start메소드를 호출하면 JVM내부에 스케줄러에 의해서 적절한 시점에 run메소드가 호출된다.
 */
class ThreadDemo01 extends Thread{
    ThreadDemo01(String name){
        super(name);
    }
    @Override
    public void run(){
        // Thread프로그래밍으로 실행하고 싶은 내용을 정의
        for(int i = 1; i<=20; i++){
            System.out.print(i+"("+getName()+")"+"\t");
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

public class Ex01_ThreadTest01 {
    public static void main(String[] args) {
        System.out.println("*****메인시작*****");
        ThreadDemo01 t1 = new ThreadDemo01("t1");
        ThreadDemo01 t2 = new ThreadDemo01("t2");
        // t1.run();        ------ 쓰레드 작업이 아니라 단순 메소드 call
        // t2.run();
        t1.start();
        t2.start();
        System.out.println("*****메인종료*****");
    }
}
