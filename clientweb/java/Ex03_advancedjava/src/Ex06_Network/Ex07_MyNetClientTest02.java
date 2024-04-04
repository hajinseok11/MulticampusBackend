package Ex06_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Ex07_MyNetClientTest02 {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream in = null; // 서버가 보내오는 데이터를 읽기 위한 스트림 객체
        DataInputStream dis = null; // 서버가 보내오는 데이터를 읽기 위한 보조스트림

        OutputStream os = null; // 서버에게 보낼 데이터를 출력하기 위한 스트림 객체
        DataOutputStream dos = null; // 서버에게 보낼 데이터를 출력하기 위한 보조스트림 객체
        
        try {
            // 1. 서버에 접속
            socket = new Socket("49.142.60.150",50000);

            // 2. 서버와 통신하기 위한 input/output스트림 객체 생성
            in = socket.getInputStream();
            dis = new DataInputStream(in);

            os = socket.getOutputStream();
            dos = new DataOutputStream(os);
            //3. 클라이언트 <- 서버(서버가 보내온 메시지를 읽기 - 2번 연속 읽기)
            //   ---------
            //   input
            String serverMsg1 = dis.readUTF();
            int serverMsg2 = dis.readInt();
            System.out.println("서버가 전송한 메시지 1>>> "+serverMsg1);
            System.out.println("서버가 전송한 메시지 2>>> "+serverMsg2);

            // 4. 클라이언트 -> 서버
            dos.writeUTF("안녕하세요 서버님....클라이언트입니다.");

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
