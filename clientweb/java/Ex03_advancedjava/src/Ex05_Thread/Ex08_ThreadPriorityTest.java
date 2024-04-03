package Ex05_Thread;

class MyThread extends Thread{

    @Override
    public void run(){
        // 시간 지연을 위한 코드 - 프로그램이 실행되는 시간을 표현
        for(int i =1; i <= 1000000000; i++){

        }
        System.out.println(getName()+"쓰레드의 우선순위 -> "+getPriority());
    }
}

public class Ex08_ThreadPriorityTest {
    public static void main(String[] args) {
        // 숫자가 클 수록 우선순위가 높다
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);
        // CPU의 성능을 판단하는 기준 중 하나가 코어의 수
        //                                  -----------
        //                                  연산을 여러개의 코어가 처리하기 때문에 코어수가 많으면 빠르게 처리할 수 있다.
        System.out.println("코어수: " + Runtime.getRuntime().availableProcessors());

        for(int i = 1;i<=3;i++){
            MyThread t = new MyThread();
            t.start();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
