package Ex05_Thread.Sync;

public class Ex01_ThreadSyncTest01 {
    public static void main(String[] args) {
        // 쓰레드에서 공유해서 사용할 객체 생성
        Toilet toilet = new Toilet();
        // 공유객체를 사용하게 될 쓰레드들을 생성
        User user1 = new User("장동건",toilet);
        User user2 = new User("이민호",toilet);
        User user3 = new User("공유",toilet);
        User user4 = new User("김어준",toilet);
        User user5 = new User("박서준",toilet);
        User user6 = new User("주진우",toilet);
        User user7 = new User("장기용",toilet);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();
        user7.start();
    }
}
