package Ex05_Thread.Sync;

public class Ex03_AccountTransferThread extends Thread{
	Obj obj;//공유객체

	public Ex03_AccountTransferThread(Obj obj) {
		super();
		this.obj = obj;
	}

	@Override
	public void run() {
		//공유객체의 메소드를 호출
		//obj.계좌이체();
		for(int i=1;i<=20;i++) {
			synchronized (obj) {
				obj.acc2.withdraw(1000000);
				System.out.println("100만원을 출금했습니다.");
				obj.acc1.deposit(1000000);
				System.out.println("100만원을 입금했습니다.");
			}
		}
	}
	
}
