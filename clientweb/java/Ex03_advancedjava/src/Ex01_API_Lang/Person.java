package Ex01_API_Lang;
import java.util.Objects;

public class Person {
    private String name;
    private String addr;
    private int age;
    public Person(){}

    // equals를 오버라이딩 하는 이유는 객체가 갖고있는 값들을 비교하기 위해서 오버라이딩
    // null, 객체의 속성, 클래스타입, obj와 this가 같은 객체인지 비교
    // 1. this와 obj가 같은 객체인지 비교
    // 2. obj가 null이 아니고 동일한 클래스 인지 비교
    // 3. 객체가 갖고있는 속성을 비교
    public boolean equals(Object obj){
        // 객체의 멤버변수들을 비교 - this와 매개변수 obj의 속성을 비교
        if(this==obj) return true;
        if(obj==null || this.getClass() != obj.getClass()) return false;
        // 객체의 멤버변수를 비교, name, age, addr
        // 객체의 멤버변수를 비교{하기 위해서 캐스팅
        if(obj instanceof Person){
            Person p = (Person) obj;
            // 객체가 갖고있는 모든 값을 비교
            if(this.name.equals(p.getName()) & this.addr.equals(p.getAddr())
                & this.age == p.getAge()){
                return true;
            }
        }
        return false;
    }
    // equals 메소드를 이용해서 같은 객체로 판단이 되면 무조건 두 객체의 hashcode가 같아야 한다.
    // HashMap, HashSet과 같은 컬렉션 객체는 해시코드를 가지고 비교
    // 같은 객체인데 해시코드가 다르면 컬렉션 내부에서 처리가 제대로 되지 않는 경우가 발생
    public int hashCode(){
        // Person객체가 갖고 있는 모든 필드값을 전달 받아서 해시코드를 생성
        // 각 매개변수의 hashcode를 구해서 종합
        return Objects.hash(addr,age,name);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", addr='" + getAddr() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }

    // public String toString(){
    //     return "name: "+name+",addr: "+addr+",age: "+age;
    // }

    public Person(String name, String addr, int age) {
        this.name = name;
        this.addr = addr;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddr() {
        return this.addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
