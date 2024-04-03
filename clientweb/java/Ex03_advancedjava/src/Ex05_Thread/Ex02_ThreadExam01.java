package Ex05_Thread;
/*
 * 1. A~Z까지 출력하는 AlphaThread 작성
 *  -> A~Z까지 출력  
 *  -> 0.5초 sleep
 * 2. 1~100까지 출력하는 DigitThread
 *  -> 10개 출력하고 줄바꿈
 *  -> 0.1초 sleep
 * 
 * 3. 메인 쓰레드 
 *  -> 1번과 2번 쓰레드를 실행
 *  -> 실행결과와 파일을 캡쳐해서 업로드
 */
public class Ex02_ThreadExam01 {
    public static void main(String[] args) {
        System.out.println("*****메인시작*****");
        System.out.println("*****메인종료*****");
        AlphaThread t1 = new AlphaThread();
        DigitThread t2 = new DigitThread();
        t1.start();
        t2.start();
    }
}
class AlphaThread extends Thread{
    @Override
    public void run() {
        for(char i='a'; i<='z'; i++) {
			System.out.print(i);
            try {
                Thread.sleep(500);     
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
		}
    }
}
class DigitThread extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
            if(i%10==0){
                System.out.println();
            try {
                Thread.sleep(100);      
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
		}
    }
}
