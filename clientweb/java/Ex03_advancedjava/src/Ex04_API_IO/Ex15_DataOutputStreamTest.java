package Ex04_API_IO;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
 * 자바에서 다양한 타입의 데이터(기본형, 문자열)를 바이트 단위로 출력할 때 사용
 * => 기본형과 문자열 데이터를 쓰기 편하도록 지원되는 클래스
 *    파일로 출력하기 위해서 FileOutputStream과 같이 사용
 */
public class Ex15_DataOutputStreamTest {
    public static void main(String[] args) throws Exception{
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("c:/MulticampusBackend/clientweb/java/Ex03_advancedjava/src/data/dos.txt"));
        dos.writeInt(1000);
        dos.writeDouble(10.5);
        dos.writeUTF("문자열");
        dos.close();
    }
}
