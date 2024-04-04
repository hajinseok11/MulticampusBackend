package Ex06_Network;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 클라이언트와 통신하기
 * 클라이언트와 메시지 주고받기 - 클라이언트의 output을 받을 수 있도록 input 스트림을 준비
 *                            - 클라이언트에게 output을 보낼 수 있도록 output 스트림을 준비
 * 
 */
public class Ex06_MyNetServerTest02 {
    public static void main(String[] args) {
        Socket client = null;
        InputStream in = null; // 클라이언트가 보내오는 데이터를 읽기 위한 스트림 객체
        DataInputStream dis = null; // 클라이언트가 보내오는 데이터를 읽기 위한 보조스트림

        OutputStream os = null; // 클라이언트에게 보낼 데이터를 출력하기 위한 스트림 객체
        DataOutputStream dos = null;  // 클라이언트에게 보낼 데이터를 출력하기 위한 보조스트림 
        try {
            // 1. ServerSocket을 생성해서 port를 열고 클라이언트 접속을 기다림
            ServerSocket server = new ServerSocket(12345);
            System.out.println("클라이언트 접속을 기다림...");
            while(true){
                // 2. 클라이언트가 접속하면 접속한 클라이언트와 통신할 수 있는 소켓 객체를 생성
                client = server.accept();
                String ip = client.getInetAddress().getHostAddress();
                System.out.println(ip+"접속");

                // 3. 클라이언트와 통신할 수 있도록 스트림 객체를 생성
                //    1) 클라이언트가 전송하는 데이터를 읽기 위한 스트림 객체를 클라이언트 소켓객체를 통해 생성
                in = client.getInputStream();
                dis = new DataInputStream(in);

                // 2. 클라이언트에게 전송할 데이터를 보내기 위한 스트림객체를 클라이언트 소켓 객체를 통해 생성
                os = client.getOutputStream();
                dos = new DataOutputStream(os);

                //==============================통신하기 ===================================
                // 4. 서버 -> 클라이언트 (순서가 중요)
                // output 2번
                dos.writeUTF(ip+"님 접속을 환영합니다.");
                dos.writeInt(20000);

                // 5. 서버 <= 클라이언트
                // input
                String clientMsg = dis.readUTF();
                System.out.println("클라이언트가 전송한 메세지>>>>"+clientMsg);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
