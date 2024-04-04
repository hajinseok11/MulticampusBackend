package Ex06_Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
 * 클라이언트가 키보드로 입력한 내용을 보내오면 메시지를 계속 읽어서 클라이언트에게 다시 보내주기
 */
public class Ex12_EchoServerTest01 {
    public static void main(String[] args) {
        Socket client = null;
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            ServerSocket server = new ServerSocket(12345);
            System.out.println("클라이언트 접속을 기다림...");
            while(true){
                client = server.accept();
                String ip = client.getInetAddress().getHostAddress();
                System.out.println(ip+"접속");
                // 클라이언트와 통신할 수 있는 Input/Output 스트림 클래스를 소켓에서 가져오기
                in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                out =new PrintWriter(client.getOutputStream(),true);

                // 클라이언트가 보내는 데이터를 계속 읽어서 클라이언트에게 다시 보내주는 작업을 처리
                String reMsg = ""; // 클라이언트가 보내오는 메세지를 저장할 변수
                while (true) {
                    // 서버 <- 클라이언트
                    reMsg = in.readLine();
                    if(reMsg == null){
                        break;
                    }
                    System.out.println("클라이언트>> "+reMsg);
                    // 서버 -> 클라이언트
                    out.println(reMsg+"^^");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
