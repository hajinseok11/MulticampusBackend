package Ex05_Thread;

class MyThread2 extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
			System.out.println(i);
            try {
                Thread.sleep(200);     
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
    }
}


// 일반 쓰레드는 메인 쓰레드와 상관없이 자신의 작업이 종료되어야 종료되는 쓰레드
// 데몬 쓰레드로 만드는 작업을 하면 메인쓰레드가 종료될 때 같이 종료될 수 있도록 작업할 수 있다.
// 데몬 쓰레드는 특별한 종류의 쓰레드고 백그라운드에서 실행되는 쓰레드를 만들 때 사용
public class Ex10_DeamonThreadTest {
    public static void main(String[] args) {
        System.out.println("***메인시작***");
        MyThread2 t = new MyThread2();
        t.setDaemon(true);  // 데몬스레드로 설정
        // 데몬 쓰레드로 만드는 작업은 start되기 전에 작업
        t.start();  // 쓰레드 실행
        for(int i=1; i<=10; i++) {
            try {
                Thread.sleep(100);     
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
        System.out.println("******메인 종료******");
    }
}
