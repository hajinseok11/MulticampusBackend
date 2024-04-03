package Ex05_Thread.Sync;

public class Toilet {
    // 1. synchronized를 메소드 전체에 추가하기 위해서 메소드 선언부에 추가하면
    // 하나의 쓰레드가 공유객체의 메소드를 사용하는 동안 다른 쓰레드가 접근할 수 없도록 lock을 적용
    // 2. 메소드 전체가 아니라 일부에만 lock처리를 하고 싶은 경우
    // synchronized(공유객체){
    //  쓰레드들이 고유하게 처리해야 하는 일
    // }
    public synchronized void open(String name){ // name은 공유객체를 사용하는 쓰레드의 이름
        System.out.println(name+"이 문열고 들어옴");
        for(int i = 1; i<=100000000;i++){
            if(i==100000){
                System.out.println(name + "이 끙~~~~~~~~~~~~~~~아~~~~~~~~~~~~~~~~");
            }
        }
    System.out.println(name+"이 문열고 나감");
    }
}
        
        

