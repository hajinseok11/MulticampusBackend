package Ex01_API_Lang;
// String클래스의 중요한 메소드를 살펴보기 -3
// String클래스의 메소드를 이용한 데이터 변환
public class Ex08_StringTest04 {
    public static void main(String[] args) {
        String str1 = new String("java programming");
        String str2 = new String("java ,oracle ,html5 css javascript jquery");
        // 1. String -> byte[]
        byte[] data1 = str1.getBytes();  // 문자여릐 문자 하나를 ASCII로 변환해서 byte[]에 저장해서 리턴 
        for(byte b:data1){
            System.out.println(b);
        }
        // 2. String -> char[]
        char[] data2 = str1.toCharArray();  // 문자열을 char[]에 저장해서 리턴
        for(char val:data2){
            System.out.println(val);
        }
        // 3. String -> String[]
        String [] data3 = str2.split(" ,"); // 문자열을 특정 기호로 잘라서 String[]로 리턴
        for(String str:data3){
            System.out.println(str);
        }
        // 4. 기본형 -> String 
        int i = 1000;
        double d = 10.5;
        test(String.valueOf(i));
        test(String.valueOf(d));
        test(i+"");
        test(d+"");
    }

    public static void test(String data){
        System.out.println("전달받은 데이터=> " + data);
    }
}
