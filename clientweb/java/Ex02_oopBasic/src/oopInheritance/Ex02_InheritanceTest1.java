package oopInheritance;
/**
 * <<상속관계에서 멤버변수가 갖는 특징>>
 * 1. 상속관계에서 상위클래스에 선언된 멤버변수는 하위 클래스에서 접근이 가능하다.
 * 2. 상위클래스에서 선언된 변수와 동일한 이름의 멤버변수를 하위클래스에서 정의하면 
 *    하위클래스 내부에서는 부모클래스의 멤버변수보다 하위 클래스의 멤버변수가 우선순위가 높다.
 * 3. 하위클래스에서 상위클래스의 멤버를 접근하고 싶은 경우 super키워드를 이용해서 접근한다.
 *    this -> 자기 자신의 객체
 *    super -> 부모객체
 * 4. 상위클래스의 멤버가 private으로 정의되어 있으면 하위클래스에서 접근할 수 없다.
 */
class Super{
    int num = 10;
}
class Sub extends Super{
    int num = 100;
    public void display(){
        System.out.println("num => "+num);
        System.out.println("부모의 num => "+super.num);
    }
}
public class Ex02_InheritanceTest1 {
    public static void main(String[] args) {
        Sub obj = new Sub();
        obj.display();
        System.out.println(obj.num);

        
    }
}
