package Ex01_API_Lang;

public class Person {
    private String name;
    private String addr;
    private int age;
    public Person(){}

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
