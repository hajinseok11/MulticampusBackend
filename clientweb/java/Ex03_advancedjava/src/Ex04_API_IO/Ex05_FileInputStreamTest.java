package Ex04_API_IO;
// 파일입력을 위한 작업
// 1. 파일 오픈 (생성자에서 처리)
// => os가 관리하는 리소스인 파일과 연결하는 작업을 처리
// => 관련 API를 이용해서 객체를 생성하는 작업
// 2. 파일 엑세스
// => 파일을 읽거나 파일에 쓰기
// => 바이트 단위나 문자단위로 데이터를 처리
// => 버퍼를 이용해서 효율적으로 IO작업을 처리할 수 있다.
// 3. 파일 닫기 (파일연결을 해제 - 자원해제)

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex05_FileInputStreamTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {fis = 
                new FileInputStream("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/test.txt"); 
                // 한 바이틀를 읽기
                System.out.println(fis.read());
        }catch (FileNotFoundException e){
            System.out.println("파일이름이 틀림");
            e.printStackTrace();
        }catch (IOException e) {
            System.out.println("파일을 읽는 중에 오류가 발생할 수 있음......");
            e.printStackTrace();
        }finally{
            try {
                if (fis!=null){fis.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
