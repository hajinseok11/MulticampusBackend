package Ex01_API_Lang;
// String은 원본이 변경되지 않고 String메소드의 호출 결과가 새로운 String객체로 만들어져서 리턴된다.
// ""(리터럴)의 형태로 문자열을 사용하더라도 각각의 String객체로 생성된다.
// 문자열 조작이 자주 발생하는 작업은 StringBuffer나 StringBuilder를 이용해서 작업한다.
// StringBuffer나 StringBuilder는 원본 문자열이 변경된다.
public class Ex10_StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("java programming");
        StringBuilder sbuilder = new StringBuilder("java programming");

        System.out.println("원본 => "+sb);
        System.out.println("원본 => "+sbuilder);

        // 문자열 뒤에 문자열을 추가하기
        sb.append("재밌다.");
        sbuilder.append("재밌다.");
        System.out.println("원본 => "+sb);
        System.out.println("원본 => "+sbuilder);

        // 문자열 중간에 삽입
        sb.insert(2, "=servlet=");
        sbuilder.insert(5,"+++++test+++++");
        System.out.println("원본 => "+sb);
        System.out.println("원본 => "+sbuilder);
        // 문자열 삭제
        sb.delete(2, 5);
        sbuilder.delete(2,5);
        System.out.println("원본 => "+sb);
        System.out.println("원본 => "+sbuilder);
        // 문자열 거꾸로 출력하기
        sb.reverse();
        sbuilder.reverse();
        System.out.println("원본 => "+sb);
        System.out.println("원본 => "+sbuilder);
    }
    
}
