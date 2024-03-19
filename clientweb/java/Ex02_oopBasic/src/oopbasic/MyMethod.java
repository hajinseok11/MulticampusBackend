package oopbasic;
// 메소드를 유형별로 정의
public class MyMethod {
    public void test(){
        System.out.println("=======================");
    }
    // 4. 매개변수, 리턴값이 모두 있는 메소드
    // => 숫자 (정수)2개를 매개변수로 전달 받아서 더한 후 결과를 리턴하는 메소드
    // => 메소드 선언부에 리턴타입으로 정의되는 타입과 무조건 동일한 타입의 값을
    // 혹은 값이 저장된 변수를 메소드의 마지막 명령문에서 return해야 한다.
    // => 리턴값은 무조건 한개만 할 수 있다.
    public int add(int num1, int num2){
        int result = 0;

        result = num1 + num2;
        test(); // 같은 클래스에 정의된 메소드는 참조변수 없이 메소드명 만으로 호출해서 사용할 수 있다.
        return result;
    }

    // 3. 리턴값이 없고 매개변수가 2개인 메소드
    // ==> 출력할 기호와 출력할 횟수를 매개변수로 전달 받아서 사용할 수 있도록 메소드 정의
    public void display(String str, int count){
        for(int i =1; i <= count; i++){
            System.out.print(str);
        }
        System.out.println();
    }

    // 2. 리턴값이 없고 매개변수가 한 개인 메소드
    // => 매개변수의 갯수, 타입, 순서를 다르게 정의하면 같은 이름의 메소드를 여러개 정의하고
    // 사용할 수 있다. 이를 메소드 오버로딩이라 한다. 
    public void display(String str){
        for(int i =1; i<=10;i++){
            System.out.print(str);
        }
        System.out.println();
    }

    // 1. 매개변수 없고 리턴값이 없는 메소드
    // => * 기호를 10번 출력하고 싶은 개발자만 활용 가능
    public void display(){
        for(int i =1; i<=10;i++){
            System.out.print("*");
        }
        System.out.println();
    }    
}
