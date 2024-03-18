package basic;

public class Ex10_RefVariableTest {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        System.out.println("==========기본형============");
        i = j; // 기본형 변수의 값을 복사 - 값이 복사
        if(i==j){
            System.out.println("기본형 같다");
        }else{
            System.out.println("기본형 다르다");
        }
        System.out.println("==========참조형============");
        String str1 = new String("java");
        String str2 = new String("java");
        if(str1==str2){
            System.out.println("참조형 같다");
        }else{
            System.out.println("참조형 다르다");
        }
        System.out.println("==========객체의 참조값 변경============");
        //참조형 변수의 값을 복사
        //str1 = str2;
        if(str1==str2){
            System.out.println("참조형 같다");
        }else{
            System.out.println("참조형 다르다");
        }
        System.out.println("==========문자열 비교============");

        if(str1.equals(str2)){
            System.out.println("문자열 같다.");
        }else{
            System.out.println("문자열 다르다");
        }
    }
}
