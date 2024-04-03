package Ex05_Thread.Sync;

public class Ex04_AccountSumThread implements Runnable{
	Obj obj;//공유객체

	public Ex04_AccountSumThread(Obj obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		//공유객체의 메소드를 호출
		//obj.출금하기();
		for(int i=1;i<=5;i++) {
			synchronized (obj) {
				long total = obj.acc1.getBalance() + obj.acc2.getBalance();
				System.out.println("총 잔액=====>"+total);
			}
			
		}
	}
	
}