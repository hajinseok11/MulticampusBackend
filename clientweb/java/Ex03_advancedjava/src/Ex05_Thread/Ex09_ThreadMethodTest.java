package Ex05_Thread;

public class Ex09_ThreadMethodTest {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("쓰레드 이름: "+t.getName());
        System.out.println("실행중인 쓰레드의 갯수: "+Thread.activeCount());

        // 아무일도 하지 않는 쓰레드 만들기
        for(int i = 1; i<=3; i++){
            Thread t2 = new Thread("t"+i);
            System.out.println(t2.getName());
            t2.start();
        }
        System.out.println("실행중인 쓰레드의 갯수: "+Thread.activeCount());
    }
}
