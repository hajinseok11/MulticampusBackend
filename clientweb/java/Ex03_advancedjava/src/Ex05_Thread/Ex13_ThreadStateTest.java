package Ex05_Thread;

public class Ex13_ThreadStateTest {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        System.out.println("쓰레드의 상태: "+ t.getState());
        t.start();
        System.out.println("쓰레드의 상태: "+ t.getState());
        System.out.println("쓰레드의 상태: "+ t.getState());
        System.out.println("쓰레드의 상태: "+ t.getState());
        System.out.println("쓰레드의 상태: "+ t.getState());
        System.out.println("쓰레드의 상태: "+ t.getState());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("쓰레드의 상태: "+ t.getState());


    }
}
