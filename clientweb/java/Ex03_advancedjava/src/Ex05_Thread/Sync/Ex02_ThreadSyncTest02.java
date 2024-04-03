package Ex05_Thread.Sync;
// 계좌이체를 여러번 처리하면서 공유객체에 세팅된 계좌의 정보가 어떻게 변경되는지 살펴보기
// 
public class Ex02_ThreadSyncTest02 {
    public static void main(String[] args) {
        // 공유객체를 생성 - 계좌이체 정보를 셋팅할 객체
        Obj obj = new Obj();
        obj.acc1 = new Account("111-222-333",10000000,"하진석");
        obj.acc2 = new Account("777-888-999",50000000,"BTS");
        // 1. 쓰레드 생성 후 테스트해보기
        // => 계좌이체하는 쓰레드 B에서 출금해서 A에 입금하기 작업을 20번 처리하는 쓰레드
        //    1000000원을 출급했습니다.
        //    1000000원을 입급했습니다.

        // => 두 계좌의 잔액을 더해서 출력하는 쓰레드 5번
        //    총 잔액 => __________
        // 쓰레드 시작
        // ==> 동기화 처리가 되지 않은 경우 계좌이체 쓰레드가 출금한 상태에서 더하는 쓰레드가 Obj를 사용하게 되면
        //     5900만원이 출력
        // 2. 동기화처리
        // ==> 잔액은 늘 6000만원으로 출력
        Ex03_AccountTransferThread t1 = new Ex03_AccountTransferThread(obj);
        Thread t2 = new Thread(new Ex04_AccountSumThread(obj));

        t1.start();
        t2.start();
    }
}
