package Ex01_API_Lang;
// String 객체의 비교
// - 리터럴로 생성
// - new 연산자를 이용해서 생성
public class Ex05_StringTest01 {
    public static void main(String[] args) {
        String str = new String("java");
        String str2 = new String("java");
        String str3 = "java";
        String str4 = "java";
        // System.out.println(str.toUpperCase()); 
        if(str == str2){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }
        System.out.println("================================");

        if(str3 == str4){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }
        System.out.println("================================");
        if(str == str4){
            System.out.println("같다");
        }else{
            System.out.println("다르다");
        }
        System.out.println("================================");
    }
}
