package Ex06_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex08_MyNetClientExam01 {
 public static void main(String[] args) {
    Socket socket = null;
        DataInputStream dis = null; // 서버가 보내오는 데이터를 읽기 위한 보조스트림
        DataOutputStream dos = null; // 서버에게 보낼 데이터를 출력하기 위한 보조스트림 객체
        try {
            // 1. 서버에 접속
            socket = new Socket("49.142.60.150",12345);
            // 2. 서버와 통신하기 위한 input/output스트림 객체 생성
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());
            //3. 클라이언트 <- 서버(서버가 보내온 메시지를 읽기 - 2번 연속 읽기)
            String serverMsg1 = dis.readUTF();
            String serverMsg2 = dis.readUTF();
            System.out.println("서버가 전송한 메시지 1>>> "+serverMsg1);
            System.out.println("서버가 전송한 메시지 2>>> "+serverMsg2);
            // 4. 클라이언트 -> 서버
            dos.writeInt(7);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
 }   
}
