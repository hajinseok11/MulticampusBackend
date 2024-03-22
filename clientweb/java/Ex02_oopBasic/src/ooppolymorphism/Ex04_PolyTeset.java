package ooppolymorphism;
abstract class ParentA{
    public abstract void print();
}
class ChildB extends ParentA{
    public void print(){
        System.out.println("ChildB");
    }
}
class ChildC extends ParentA{
    public void print(){
        System.out.println("ChildC");
    }
}
class ChildD extends ParentA{
    public void print(){
        System.out.println("ChildD");
    }
}
class NewChild extends ParentA{
    public void print(){
        System.out.println("NewChild");
    }
}



public class Ex04_PolyTeset {
    public static void main(String[] args) {
        // ChildB obj = new ChildC();
        ParentA obj = new ChildB();
        ParentA obj2 = new ChildC();
        ParentA obj3 = new ChildD();
        ParentA obj4 = new NewChild();
        test(obj4);
    }
    // 잘 실행되고있는 시스템
    public static void test(ParentA obj){
        obj.print();
    }
}
