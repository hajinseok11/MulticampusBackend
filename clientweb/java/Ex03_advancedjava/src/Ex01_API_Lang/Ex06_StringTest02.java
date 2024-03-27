package Ex01_API_Lang;
// String 클래스의 중요한 메소드를 살펴보기 -1
public class Ex06_StringTest02 {
    public static void main(String[] args) {
        String str1 = new String("Java Programming");
        String str2 = "재밌다.";
        System.out.println("str1.charAt(1) => " + str1.charAt(1));
        System.out.println("str1.concat(str2) => " + str1.concat(str2));
        System.out.println("str1.indexOf('a') => " + str1.indexOf('a'));
        System.out.println("str1.indexOf(\"합\") => " + str1.indexOf("합"));
        System.out.println("str1.lastIndexOf('a') => " + str1.lastIndexOf('a'));
        System.out.println("str1.lastIndexOf(\"합\") => " + str1.lastIndexOf("합"));

        System.out.println("str1.length() => " + str1.length());

        System.out.println("str1.equals(\"java programming\") => " + str1.equals("java programming"));
        System.out.println("str1.equals(\"java programming\") => " + str1.equals("Java programming"));
        System.out.println("str1.equalsIgnoreCase(\"java programming\") => " 
                            + str1.equalsIgnoreCase("java programming"));
        System.out.println("str1.equalsIgnoreCase(\"java programming\") => " 
                            + str1.equalsIgnoreCase("Java programming"));
        System.out.println("원본===> "+str1);
        // 대소문자를 변환
        System.out.println("str1.toUpperCase() => " + str1.toUpperCase());
        System.out.println("원본===> "+str1);
        System.out.println("str1.toLowerCase() => " + str1.toLowerCase());
        System.out.println("원본===> "+str1);


        // 미션
        // ex) java를 args[0] 입력받으면
        // AVAJ로 출력하기
        // 힌트 - 한문자씩 제어하기 위해서 for문과 같이 사용
        String data = args[0].toUpperCase();
        System.out.println(data);
        int size = data.length();
        for (int i = 0; i < data.length(); i++){
            System.out.print(data.charAt(i));
        }
        System.out.println("===================================");
        for (int i = data.length()-1; i >= 0; i--){
            System.out.print(data.charAt(i));
        }
    }
}
