package Ex05_Thread.Sync;

public class User extends Thread {
    String name;
    Toilet toilet;
    public User(String name, Toilet toilet){
        super();
        this.name = name;
        this.toilet = toilet;
    }
    @Override
    public void run(){
        toilet.open(name);
    }

}
