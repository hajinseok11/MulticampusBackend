package Ex05_Thread;
/*
 * 1. 1부터 100까지짝수를 출력하는 쓰레드
 *    0.1초 sleep
 * 2. 1부터 1000까지 홀수를 출력하는 쓰레드
 *    0.2초 sleep
 * 
 * 1번 쓰레드에서 값이 50이 넘어가면 쓰레드가 종료될 수 있도록 처리(flag변수를 이용해서 종료)
 * 2번 쓰레드에서 70이 넘어가면 쓰레드가 종료될 수 있도록 처리 (interrupt를 발생시키고 작업)
 */

class EvenThread extends Thread{
    private boolean state = true;
    EvenThread(String name) {
        super(name);
    }
    public void run(){
        int i = 2;
        while(state&i<=100){
            System.out.println(getName()+": "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i = i+2;
            if(i>50){
                StopThread();
            }
        }
    }
    // 쓰레드의 현재 상태값이 저장된 변수를 변경할 수 있는 메소드
    public void StopThread(){
        state = false;
    }
}
class OddThread extends Thread{

    OddThread(String name) {
        super(name);
    }

    public void run(){
        int i = 2;
        while (!Thread.currentThread().isInterrupted() & i<=1000) {
            System.out.println(getName()+": "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i = i+2;
            if(i>70){
                interrupt();
            }
            
        }
    }
}



public class Ex14_ThreadExam02 {
    public static void main(String[] args) {
        EvenThread t = new EvenThread("짝수");
        t.start();
        OddThread t2 = new OddThread("홀수");
        t2.start();
    }
}
