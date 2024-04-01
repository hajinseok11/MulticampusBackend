package Ex04_API_IO;

import java.io.BufferedReader;
// BufferedReader는 입출력 작업의 효율을 높이기 위해서 임시로 읽은 데이터를 저장할 수 있는 버퍼를 사용해서
// 입출력을 모아서 한번에 처리하는 기능을 제공
// BufferedReader와 같은 보조스트림은 실제 데이터소스(파일, 키보드 입력, 네트워크 입력,,,)와 직업 연결이 불가능하므로
// -> 실제 데이터소스와 연결이 되는 스트림 객체를 생성한 후 보조스트림과 연결시켜야 한다.
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex10_BufferedReaderTest {
    public static void main(String[] args) {
        // 보조스트림은 자체적으로 입출력을 수행할 수 없고
        // 입출력을 하도록 설정된 클래스를 도와주는 역할을 수행한다.
        // FileReader fr = null;
        BufferedReader br = null;
        try {
            // 원시데이터를 이용해서 읽기 작업을 처리할 수 있는 객체 생성
            // fr = new FileReader("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/test.txt");
            // br = new BufferedReader(fr);
            br = new BufferedReader(new FileReader("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/test.txt"));
            while (true){
                String line = br.readLine();
                if (line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                if(br!= null)br.close();
            } catch (IOException e) {
                e.printStackTrace();
            };
        }
    }
}
