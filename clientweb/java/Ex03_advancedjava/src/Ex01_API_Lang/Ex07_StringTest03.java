package Ex01_API_Lang;

// String클래스의 중요한 메소드를 살펴보기 -2(검색과 추룰)
public class Ex07_StringTest03 {
    public static void main(String[] args) {
        String str1 = new String("java programming");
        String str2 = "재밌다." + "test" + "java";

        System.out.println("str1.startsWith(\"java\")"+str1.startsWith("java"));
        System.out.println("str1.startsWith(\"test\")"+str1.startsWith("test"));
        System.out.println("str1.endsWith(\"ing\")"+str1.endsWith("ing"));
        System.out.println("str1.endsWith(\"java\")"+str1.endsWith("java"));
        System.out.println("str1.contains(\"ja\")"+str1.contains("ja"));
        System.out.println("str1.contains(\" \")"+str1.contains(" "));

        System.out.println("str1.substring(5)" + str1.substring(5));    //begins ~ 끝
        System.out.println("str1.substring(5,8)" + str1.substring(5,8));    //begin ~ end -1
        System.out.println("str1.substring('a','A')" + str1.replace('a','A'));
        System.out.println(str1);   //원본출력
        
    }
}
