package Ex03_API_Util;

import java.util.StringTokenizer;

public class Ex01_StringTokenizerTest {
    public static void main(String[] args) {
        String str = "java,mysql,oracle,html,css,javascript,jQuery";
        StringTokenizer st = new StringTokenizer(str,",");  // 내부저장소에 ,로 분리된 문자열이 저장
        System.out.println(st.hasMoreTokens());                   //             -----------------------
        // System.out.println(st.nextToken());                    //                token
        while(st.hasMoreTokens()){              // 내부저장소에 토큰이 있으면
            String token = st.nextToken();      // 내부저장소의 토큰을 꺼내라
            System.out.println("토큰: "+ token);
        }

    }
}
