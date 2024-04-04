package Ex06_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
// BufferedReader와 PrintWriter를 이용해서 작업
public class Ex10_MyNetServerTest03 {
    public static void main(String[] args) {
        Socket client = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            // 1. ServerSocket을 생성해서 port를 열고 클라이언트 접속을 기다림
            ServerSocket server = new ServerSocket(12345);
            System.out.println("클라이언트 접속을 기다림...");
            while(true){
                client = server.accept();
                String ip = client.getInetAddress().getHostAddress();
                System.out.println(ip+"접속");

                in = new BufferedReader(
                        new InputStreamReader(
                            client.getInputStream()));
                out = new PrintWriter(client.getOutputStream(),true);
                // 4. 서버 -> 클라이언트 (순서가 중요)
                out.println("안녕, 환영합니다."+ip+"님");
                out.println("출력할 단: ");

                // 5. 서버 <= 클라이언트
                // input
                int dan = Integer.parseInt(in.readLine());
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
