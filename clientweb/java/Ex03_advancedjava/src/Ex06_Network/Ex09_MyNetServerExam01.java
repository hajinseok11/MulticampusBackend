package Ex06_Network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex09_MyNetServerExam01 {
    public static void main(String[] args) {
        Socket client = null;
        DataInputStream dis = null; // 클라이언트가 보내오는 데이터를 읽기 위한 보조스트림
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

                dis = new DataInputStream(client.getInputStream());
                dos = new DataOutputStream(client.getOutputStream());
                //==============================통신하기 ===================================
                // 4. 서버 -> 클라이언트 (순서가 중요)
                dos.writeUTF("안녕, 환영합니다."+ip+"님");
                dos.writeUTF("출력할 단: ");

                // 5. 서버 <= 클라이언트
                // input
                int dan = dis.readInt();
                System.out.println("클라이언트가 전송한 메세지>>>>"+dan);
                for(int i = 1; i<=9; i++){
                    System.out.println(dan+"*"+i+"="+(dan*i));
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
