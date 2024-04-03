package Ex05_Thread;
// 쓰레드 중지하기
/**
 * 한번 start된 쓰레드는 절대 다시 실행할 수 없다.
 * => 일회용
 * 
 * [쓰레드를 종료]
 * 2. 인터럽트를 발생시키고 현재 상태를 확인한 후 작업하기
 * 
 */
class StopThread02 extends Thread{
    // 현재 상태값을 저장할 수 있는 변수
    private boolean state = true;
    public void run(){
        // 인터럽트 발생되지 않는 동안 실행할 수 있도록 처리
            try {
                while(Thread.currentThread().isInterrupted()){
                System.out.println("현재 쓰레드의 상태: 실행중~~");
                Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            
            } finally{
                System.out.println("현재 쓰레드의 상태: 종료상태");
            }
        }
        
    }


public class Ex12_StopThreadTest02 {
    public static void main(String[] args) {
        System.out.println("***메인시작***");
        StopThread02 t = new StopThread02();
        t.start();  // 쓰레드 실행
        System.out.println("쓰레드 이름:" + t.getName());
        // 인터럽트가 발생되면 true, 그렇지 않으면 false
        System.out.println("인터럽트상태:" + t.isInterrupted());
        System.out.println("인터럽트상태:" + t.isInterrupted());
            try {
                Thread.sleep(3000);     
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 인터럽트 발생
            t.interrupt();
            System.out.println("인터럽트 상태:"+t.isInterrupted());
            System.out.println("인터럽트 상태:"+t.isInterrupted());
            System.out.println("인터럽트 상태:"+t.isInterrupted());
            System.out.println("인터럽트 상태:"+t.isInterrupted());
            System.out.println("***메인종료***");
		}
}

