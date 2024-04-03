package Ex05_Thread;
// 쓰레드 중지하기
/**
 * 한번 start된 쓰레드는 절대 다시 실행할 수 없다.
 * => 일회용
 * 
 * [쓰레드를 종료]
 * 1. 임의의 변수를 선언해서 종료하는 방법
 *    ----------------
 *      flag 변수
 *      - 변수에 저장된 값에 따라서 작업을 처리할 목적으로 선언하는 변수(실행 or 종료 - boolean, int...)
 *      - 변수값을 체크(오래 걸리는 작업인 경우에 중간에 stop할 수 있도록 처리)
 * 
 */
class StopThread extends Thread{
    // 현재 상태값을 저장할 수 있는 변수
    private boolean state = true;
    public void run(){
        while(state){
            System.out.println("현재 쓰레드의 상태: 실행중~~");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("현재 쓰레드의 상태: 종료상태");
    }
    // 쓰레드의 현재 상태값이 저장된 변수를 변경할 수 있는 메소드
    public void StopThread(){
        state = false;
    }

}
public class Ex11_StopThreadTest01 {
    public static void main(String[] args) {
        System.out.println("***메인시작***");
        StopThread t = new StopThread();
        t.start();  // 쓰레드 실행
            try {
                Thread.sleep(3000);     
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 쓰레드 실행을 제어하는 변수인 쓰레드 객체의 state를 변경하면서 쓰레드를 종료
            t.StopThread();
            System.out.println("***메인종료***");
		}
}

