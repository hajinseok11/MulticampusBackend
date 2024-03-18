package basic;

public class Ex13_APIExam1 {
    public static void main(String[] args) {
        String str = new String("java programming");
        String str2 = "java programming";// 참조형에서 String Wrapper타입만 기본형처럼 리터럴로 사용하도록 허용
        int size2 = str2.length();
        System.out.println("문자열의 길이: " + str.length());
        System.out.println("문자열의 길이: " + size2);

    }
}
