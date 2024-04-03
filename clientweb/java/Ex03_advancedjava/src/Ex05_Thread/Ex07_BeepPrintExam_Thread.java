package Ex05_Thread;
import java.awt.Toolkit;

// 쓰레드를 사용하지 않는 경우
// beep와 print가 같이 실행될 수 있도록 쓰레드를 이용해서 작업
// 익명 inner클래스를 사용
public class Ex07_BeepPrintExam_Thread {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for(int i =1 ; i<=5; i++){
            toolkit.beep();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 1; i<=5;i++){
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
