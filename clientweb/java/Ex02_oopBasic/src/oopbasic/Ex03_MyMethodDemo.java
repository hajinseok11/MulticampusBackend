package oopbasic;

public class Ex03_MyMethodDemo {
    public static void main(String[] args) {
        MyMethod2 gugu = new MyMethod2();
        gugu.GuGu(4);
    
        MyMethod2 multiForGugu = new MyMethod2();
        multiForGugu.printGuGu();
        
        MyMethod2 caluator = new MyMethod2();
        caluator.calc(1,4,6);
    }
}
