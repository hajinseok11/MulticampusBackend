package Ex05_Thread.Sync;

public class Obj {
    Account acc1;// 하진석 꼐좌 - 이체를 받을 계좌
    Account acc2;// BTS계좌 - BTS계좌 - 이체할 계좌
    /* 공유객체에 메소드를 직접 정의하고 사용하는 경우 */
    public synchronized void 계좌이체(){
        for(int i = 1;i<=20;i++){
            acc2.withdraw(1000000);
            System.out.println("100만원을 출금했습니다.");
            acc1.deposit(1000000);
            System.out.println("100만원을 입금했습니다.");
        }
    }
    public synchronized void 출금하기(){
        for(int i =1; i<=5; i++){
            long total=acc1.getBalance()+acc2.getBalance();
            System.out.println("총 잔액 =====>"+total);
        }
    }
}
