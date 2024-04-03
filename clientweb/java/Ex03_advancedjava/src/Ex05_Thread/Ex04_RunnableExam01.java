package Ex05_Thread;
// ThreadExam01에서 작업한 내용을 Runnable 인터페이스를 구현하는 코드로 변경
// AlphaRunnable, DigitRunnable
public class Ex04_RunnableExam01 {
    public static void main(String[] args) {
        
    }
}

class AlphaRunnable implements Runnable{
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
class DigitRunnable implements Runnable{

    @Override
    public void run() {
        // TODO Auto-generated method stub
        
    }
    
}
