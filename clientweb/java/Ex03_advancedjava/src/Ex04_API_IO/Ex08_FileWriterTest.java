package Ex04_API_IO;

import java.io.FileWriter;
import java.io.IOException;

// 문자단위로 출력
public class Ex08_FileWriterTest {
    public static void main(String[] args) throws IOException{
        // 파일 출력의 기본은 덮어쓰기
        // 1. 출력할 파일과 연결 (파일열기)
        // => 파일이 존재하지 않으면 파일을 생성해서 쓴다.\
        // append모드를 정의
        // true를 추가하면 데이터가 덮어쓰지 않고 추가
        FileWriter fw = new FileWriter("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/result.txt",true);
        // 2. 파일 엑세스
        // write 메소드는 new line이 포함되지 않음
        fw.write(97);
        fw.write(98);
        fw.write("안녕~~\n");
        fw.write("안녕~~\n");
        fw.write("test~~\n");
        fw.write(123);
        // 3. 파일 닫기 - 리소스를 해제
        // close가 호출되지 않으면 파일 엑세스 중으로 판단해서 쓰기가 완료가 되지않는다.
        fw.close(); 
    }
}
